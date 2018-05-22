package com.maxrocky.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author yado
 * @create 2018-05-14 18:05
 * @desc 简单控制器
 **/
//1.利用@Controller注解声明这是一个控制器
@Controller
public class HelloController {

    /**
     * 使用Tomcat启动
     */

    //2.利用@RequestMapping配置URL和方法之间的映射
    @RequestMapping("/hello")
    public String hello(){

        System.err.println("success");
        //3.通过上面ViewResolver的Bean配置，返回值为index，说明我们的页面放置的路径为/WEB-INF/classes/view/index.js;
        return "index";
    }

}