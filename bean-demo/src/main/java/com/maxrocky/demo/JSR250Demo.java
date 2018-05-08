package com.maxrocky.demo;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @author yado
 * @create 2018-05-08 15:27
 * @desc jsr250形式的Bean
 **/
@Component
public class JSR250Demo {

    /**
     *  1.@PostConstruct,在构造函数执行完之后执行。
     *  2.@PreDestroy，在Bean销毁之前执行。
     */
    @PostConstruct
    public void init(){
        System.out.println("JSR250-init-method");
    }

    public JSR250Demo(){
        super();
        System.out.println("初始化构造函数：JSR250Demo");
    }

    @PreDestroy
    public void destory(){
        System.out.println("JSR250-destory-method");
    }

}