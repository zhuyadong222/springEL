package com.maxrocky.main;

import com.maxrocky.config.ProConfig;
import com.maxrocky.demo.BeanDemo;
import com.maxrocky.demo.JSR250Demo;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author yado
 * @create 2018-05-08 15:32
 * @desc
 **/
public class main {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProConfig.class);

        BeanDemo beanDemo = context.getBean(BeanDemo.class);
        JSR250Demo demo = context.getBean(JSR250Demo.class);

        context.close();

    }

}