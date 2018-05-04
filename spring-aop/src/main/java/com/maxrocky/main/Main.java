package com.maxrocky.main;

import com.maxrocky.annotation.DemoAnnotationService;
import com.maxrocky.annotation.DemoMethodService;
import com.maxrocky.cofig.AopConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author yado
 * @create 2018-05-04 10:19
 * @desc
 **/
public class Main {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AopConfig.class);

        DemoAnnotationService demoAnnotationService = context.getBean(DemoAnnotationService.class);
        DemoMethodService demoMethodService = context.getBean(DemoMethodService.class);

        demoAnnotationService.add();
        demoMethodService.add();

        context.close();

    }

}