package com.maxrocky.main;

import com.maxrocky.config.MulAnnotationConfig;
import com.maxrocky.demo.MulAnnotationDemo;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author yado
 * @create 2018-05-11 18:01
 * @desc
 **/
public class Main {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MulAnnotationConfig.class);

        MulAnnotationDemo bean = context.getBean(MulAnnotationDemo.class);
        bean.outputResult();

        context.close();

    }

}