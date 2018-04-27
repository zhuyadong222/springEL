package com.maxrocky;

import com.maxrocky.config.JavaConfig;
import com.maxrocky.service.HelloService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class JavaConfigApplication {

	public static void main(String[] args) {
		SpringApplication.run(JavaConfigApplication.class, args);
	}
}
