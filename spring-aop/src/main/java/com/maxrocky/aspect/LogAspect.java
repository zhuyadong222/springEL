package com.maxrocky.aspect;

import com.maxrocky.aop.Action;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

/**
 * @author yado
 * @create 2018-05-04 10:01
 * @desc 编写切面
 **/
@Aspect
@Component
public class LogAspect {

//    @Pointcut("execution(* com.maxrocky.annotation.DemoAnnotation.*(..))")
    @Pointcut("@annotation(com.maxrocky.aop.Action)")
    public void annotationPointCut(){}

    @After("annotationPointCut()")
    public void after(JoinPoint joinPoint) {
        MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
        Method method = methodSignature.getMethod();
        Action action = method.getAnnotation(Action.class);
        System.out.println("注解式拦截，" + action.name());
    }

    @Before("execution(* com.maxrocky.annotation.DemoMethodService.*(..))")
    public void before(JoinPoint joinPoint) {
        MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
        Method method = methodSignature.getMethod();
        System.out.println("方法规则式拦截，" + method.getName());
    }

}