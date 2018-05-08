package com.maxrocky.config;

import com.maxrocky.demo.BeanDemo;
import com.maxrocky.demo.JSR250Demo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author yado
 * @create 2018-05-08 15:32
 * @desc
 **/
@Configuration
@ComponentScan("com.maxrocky.demo")
public class ProConfig {

    @Bean(initMethod = "init", destroyMethod = "destroy")
    BeanDemo beanDemo(){
        return new BeanDemo();
    }

    //可以省略
//    @Bean
//    JSR250Demo jsr250Demo(){
//        return new JSR250Demo();
//    }

}