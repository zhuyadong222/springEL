package com.maxrocky.config;

import com.maxrocky.bean.LinuxListDemo;
import com.maxrocky.bean.ListDemo;
import com.maxrocky.bean.WindowsListDemo;
import com.maxrocky.condition.LinuxCondition;
import com.maxrocky.condition.WindowsCondition;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

/**
 * @author yado
 * @create 2018-05-11 14:17
 * @desc 配置类
 **/
@Configuration
@ComponentScan("com.maxrocky.bean")
public class ConditionConfig {

    /**
     *  1.通过@Conditional注解，符合Windows条件则实例化windowListDmo
     *  2.通过@Conditional注解，符合Linux条件则实例化linuxListDemo
     *
     *  不适用bean注入，使用注解注入也行，在各自的WindowsListDemo加上注解@Conditional(WindowsCondition.class)
     *
     */

//    @Bean
//    @Conditional(WindowsCondition.class)
//    public ListDemo windowsListDemo(){
//        return new WindowsListDemo();
//    }
//
//    @Bean
//    @Conditional(LinuxCondition.class)
//    public ListDemo linuxListDemo(){
//        return new LinuxListDemo();
//    }

}