package com.maxrocky.main;

import com.maxrocky.config.JavaConfig;
import com.maxrocky.controller.HelloController;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author yado
 * @create 2018-04-26 18:04
 * @desc
 **/
public class TestMain {

    public static void main(String[] args) {
        //测试不成功，不知道为啥
        ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);

        HelloController bean = context.getBean(HelloController.class);
        bean.greet();


    }

}