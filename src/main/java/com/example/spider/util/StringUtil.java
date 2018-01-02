package com.example.spider.util;

import lombok.extern.slf4j.Slf4j;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: WangNan
 * Email：nan.wang@htouhui.com
 * Date: 2017-12-28
 * Time: 下午4:45
 */
@Slf4j
public class StringUtil {

    public static String matchPhone(String managers) {
        Pattern pattern = Pattern.compile("(1[3|4|5|8]\\d{9})|(\\d{3}\\*{4}\\d{4})");
        return match(pattern, managers);
    }

    public static String matchDate(String managers) {
        Pattern pattern = Pattern.compile("(\\d{4}(\\-|\\/|\\.)\\d{1,2}(\\-|\\/|\\.)\\d{1,2})|(\\d{4}年\\d{1,2}月\\d{1,2}日)");
        return match(pattern, managers);
    }

    public static String match(String pattern, String managers) {
        return match(Pattern.compile(pattern), managers);
    }

    public static String match(Pattern pattern, String managers) {
        try {
            Matcher matcher = pattern.matcher(managers);
            boolean b = matcher.find();
            if (b) return matcher.group();
        } catch (Exception e) {
            log.error("pattern match error!", e);
        }
        return null;
    }

}
