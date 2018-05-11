package com.maxrocky.main;

import com.maxrocky.bean.ListDemo;
import com.maxrocky.config.ConditionConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author yado
 * @create 2018-05-11 14:28
 * @desc
 **/
public class main {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ConditionConfig.class);

        ListDemo bean = context.getBean(ListDemo.class);

        System.out.println(context.getEnvironment().getProperty("os.name") + "系统下的列表命令为：" + bean.showListCmd());
    }

}