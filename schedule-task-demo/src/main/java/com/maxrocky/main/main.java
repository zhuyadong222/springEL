package com.maxrocky.main;

import com.maxrocky.config.ScheduledTaskConfig;
import com.maxrocky.scheduledtask.ScheduledTaskDemo;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author yado
 * @create 2018-05-10 17:44
 * @desc
 **/
public class main {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ScheduledTaskConfig.class);
//        ScheduledTaskDemo bean = context.getBean(ScheduledTaskDemo.class);
//
//        context.close();

    }

}