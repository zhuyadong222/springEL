package com.maxrocky.main;

import com.maxrocky.config.DemoConfig;
import com.maxrocky.event.DemoPublisher;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author yado
 * @create 2018-05-09 17:34
 * @desc
 **/
public class Main {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DemoConfig.class);

        DemoPublisher bean = context.getBean(DemoPublisher.class);

        bean.publish("hello application event!");

        context.close();

    }

}