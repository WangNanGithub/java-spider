package com.example.spider;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.spider")
public class JavaSpiderApplication {

	public static void main(String[] args) {
		SpringApplication.run(JavaSpiderApplication.class, args);
	}
}
