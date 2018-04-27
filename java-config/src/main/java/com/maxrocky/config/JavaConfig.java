package com.maxrocky.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author yado
 * @create 2018-04-26 18:02
 * @desc
 **/
@Configuration
@ComponentScan("com.maxrocky")
public class JavaConfig {

    public JavaConfig(){
        System.out.println("java容器启动中。。。。");
    }

}