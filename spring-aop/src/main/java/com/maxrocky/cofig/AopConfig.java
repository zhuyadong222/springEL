package com.maxrocky.cofig;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @author yado
 * @create 2018-05-04 10:16
 * @desc 配置类
 **/
@Configuration
@ComponentScan("com.maxrocky")
@EnableAspectJAutoProxy     //开启spring对AspectJ代理的支持
public class AopConfig {



}