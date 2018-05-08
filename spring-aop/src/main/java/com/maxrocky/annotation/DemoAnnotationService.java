package com.maxrocky.annotation;

import com.maxrocky.aop.Action;
import org.springframework.stereotype.Component;

/**
 * @author yado
 * @create 2018-05-04 9:56
 * @desc 编写使用注解的被拦截类
 **/
@Component
public class DemoAnnotationService {

    @Action(name = "注解式拦截的add操作")
    public void add(){}

}