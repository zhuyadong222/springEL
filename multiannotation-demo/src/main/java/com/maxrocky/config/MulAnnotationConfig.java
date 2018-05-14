package com.maxrocky.config;

import com.maxrocky.annotation.WiselyConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author yado
 * @create 2018-05-11 17:59
 * @desc 配置类
 **/
//使用@WiselyConfiguration组合注解代替@Configuration和@ComponentScan
//@Configuration
//@ComponentScan("com.maxrocky.demo")
@WiselyConfiguration(basePackages = "com.maxrocky.demo")
public class MulAnnotationConfig {
}