package com.wangqing.springthymeleafsimple;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackageClasses = com.wangqing.controller.HomeController.class)
public class SpringThymeleafSimpleApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringThymeleafSimpleApplication.class, args);
	}
}
