package com.example.spider;

import com.example.spider.crawl.annotation.Crawl;
import com.example.spider.crawl.entity.CrawlType;
import com.example.spider.crawl.entity.UserAccount;
import com.example.spider.crawl.mapper.UserAccountInfoMapper;
import com.example.spider.crawl.service.CrawlLoginService;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.tuple.Pair;
import org.openqa.selenium.WebDriver;
import org.reflections.Reflections;
import org.reflections.scanners.MethodAnnotationsScanner;
import org.reflections.scanners.SubTypesScanner;
import org.reflections.scanners.TypeAnnotationsScanner;
import org.reflections.util.ClasspathHelper;
import org.reflections.util.ConfigurationBuilder;
import org.reflections.util.FilterBuilder;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Service;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.*;

@Slf4j
@Service
public class CrawlStarter implements ApplicationContextAware {

    private ApplicationContext applicationContext;

    @Autowired
    private UserAccountInfoMapper userAccountInfoMapper;

    public void start(Long userId) {
        Reflections reflections = new Reflections(new ConfigurationBuilder()
                .setUrls(ClasspathHelper.forPackage("com.example.spider"))
                .setScanners(new MethodAnnotationsScanner(), new TypeAnnotationsScanner(), new SubTypesScanner())
                .filterInputsBy(new FilterBuilder().include("com.example.spider.*"))
        );

        Set<CrawlType> crawlNameSet = new HashSet<>();
        Set<Class<?>> crawlSet = reflections.getTypesAnnotatedWith(Crawl.class);
        crawlSet.forEach(x -> crawlNameSet.addAll(Arrays.asList(x.getAnnotation(Crawl.class).name())));

        for (CrawlType name : crawlNameSet) {
            ArrayList<Class<?>> classes = new ArrayList<>(50);
            classes.add(null);
            for (Class<?> aClass : crawlSet) {
                List<CrawlType> names = Arrays.asList(aClass.getAnnotation(Crawl.class).name());
                if (names.contains(name)) {
                    if (Arrays.asList(aClass.getInterfaces()).contains(CrawlLoginService.class)) {
                        classes.set(0, aClass);
                    } else {
                        classes.add(aClass);
                    }
                }
            }

            WebDriver webDriver = null;
            Pair<String, String> pair = getUsernameAndPassword(userId, name);
            for (Class<?> aClass : classes) {
                if (Arrays.asList(aClass.getInterfaces()).contains(CrawlLoginService.class)) {
                    // 执行登陆方法
                    try {
                        Method login = aClass.getMethod("login", String.class, String.class);
                        Object object = applicationContext.getBean(aClass);
                        webDriver = (WebDriver) login.invoke(object, pair.getLeft(), pair.getRight());
                    } catch (NoSuchMethodException e) {
                        log.error("can not found login method with (String, String)!");
                    } catch (IllegalAccessException | InvocationTargetException e) {
                        log.error("invoke method error!");
                    }
                } else {
                    try {
                        Object object = applicationContext.getBean(aClass);
                        // 判断当前抓取方法是否需要执行
                        Method statusMethod = aClass.getMethod("status");
                        boolean status = (boolean) statusMethod.invoke(object);
                        if (status) {
                            // 抓取数据
                            Method crawl = aClass.getMethod("crawl", WebDriver.class, Long.class);
                            webDriver = (WebDriver) crawl.invoke(object, webDriver, userId);
                            // 保存数据
                            Method save = aClass.getMethod("save");
                            save.invoke(object);
                        }
                    } catch (NoSuchMethodException e) {
                        log.error("can not found crawl method with (WebDriver)!");
                    } catch (IllegalAccessException | InvocationTargetException e) {
                        log.error("invoke method error!");
                    }
                }
            }
            if (webDriver != null) {
                webDriver.quit();
            }
        }
    }

    /**
     * 根据用户 ID 和抓取类型获取用户对应的账号和密码
     *
     * @param userId 用户 ID
     * @param type   抓取类型(@Crawl 注解中的值)
     * @return Pair pair.left: username, pair.right: password
     */
    private Pair<String, String> getUsernameAndPassword(Long userId, CrawlType type) {
        UserAccount account = userAccountInfoMapper.findByUserIdAndType(userId, type);
        return Pair.of(account.getUsername(), account.getPassword());
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }

}
