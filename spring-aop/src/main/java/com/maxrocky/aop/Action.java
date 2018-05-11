package com.maxrocky.aop;

import java.lang.annotation.*;

/**
 * @author yado
 * @create 2018-05-04 9:50
 * @desc    自定义注解
 *          编写拦截规则的注解
 *          注解本身是没有功能的，和xml文件一样，都是元数据，即解释数据的数据，就是所谓的配置文件
 **/

/**
 *  相关介绍查看笔记"java自定义注解"
 */

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Action {

    String name();

}