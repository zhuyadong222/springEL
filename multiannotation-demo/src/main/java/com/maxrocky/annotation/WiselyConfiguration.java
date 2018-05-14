package com.maxrocky.annotation;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.lang.annotation.*;

/**
 * @author yado
 * @create 2018-05-11 17:50
 * @desc 组合注解
 **/
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Configuration  //组合Configuration元注解
@ComponentScan  //组合@ComponentScan元注解
public @interface WiselyConfiguration {

    //覆盖value参数
    //使用会报注入异常
//    String[] value() default {};

    String[] basePackages() default {};

}