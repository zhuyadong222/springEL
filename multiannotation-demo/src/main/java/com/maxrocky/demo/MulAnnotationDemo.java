package com.maxrocky.demo;

import org.springframework.stereotype.Component;

/**
 * @author yado
 * @create 2018-05-11 18:00
 * @desc
 **/
@Component
public class MulAnnotationDemo {

    public void outputResult(){
        System.out.println("从组合注解配置中照样能获取bean。。。");
    }

}