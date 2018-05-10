package com.maxrocky.main;

import com.maxrocky.config.AwareConfig;
import com.maxrocky.demo.AwareDemo;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author yado
 * @create 2018-05-10 15:23
 * @desc
 **/
public class main {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AwareConfig.class);
        AwareDemo bean = context.getBean(AwareDemo.class);

        bean.outputResult();

        context.close();

    }

}