package com.maxrocky.annotation;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.lang.annotation.*;

/**
 * @author yado
 * @create 2018-05-14 17:39
 * @desc 组合注解
 **/
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Configuration
@ComponentScan
public @interface WiselyConfiguration {

    String[] basePackages() default {};

}