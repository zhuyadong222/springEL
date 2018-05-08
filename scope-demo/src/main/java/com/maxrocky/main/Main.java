package com.maxrocky.main;

import com.maxrocky.config.ScopeConfig;
import com.maxrocky.controller.DemoPrototypeController;
import com.maxrocky.controller.DemoSingletonController;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author yado
 * @create 2018-05-04 17:07
 * @desc
 **/
public class Main {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ScopeConfig.class);

        DemoSingletonController s1 = context.getBean(DemoSingletonController.class);
        DemoSingletonController s2 = context.getBean(DemoSingletonController.class);

        System.out.println("单例模式下，两个实例是否相等：" + s1.equals(s2));

        DemoPrototypeController p1 = context.getBean(DemoPrototypeController.class);
        DemoPrototypeController p2 = context.getBean(DemoPrototypeController.class);

        System.out.println("多例模式下，两个实例是否相等：" + p1.equals(p2));
    }

}