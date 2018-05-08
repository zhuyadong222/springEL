package com.maxrocky.main;

import com.maxrocky.demo.config.ElConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author yado
 * @create 2018-05-08 11:13
 * @desc
 **/
public class TestMain {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ElConfig.class);
        ElConfig bean = context.getBean(ElConfig.class);

        bean.outputResource();

        context.close();

    }
    
}