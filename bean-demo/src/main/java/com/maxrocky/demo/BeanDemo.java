package com.maxrocky.demo;

import org.springframework.stereotype.Component;

/**
 * @author yado
 * @create 2018-05-08 15:35
 * @desc @Bean形式的Bean
 **/
@Component
public class BeanDemo {

    public void init(){
        System.out.println("@Bean-init-method");
    }

    public BeanDemo(){
        super();
        System.out.println("初始化构造函数：BeanDemo");
    }

    public void destroy(){
        System.out.println("@Bean-destroy-method");
    }

}