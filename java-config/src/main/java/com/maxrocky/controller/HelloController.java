package com.maxrocky.controller;

import com.maxrocky.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author yado
 * @create 2018-04-26 17:55
 * @desc
 **/
@RestController
public class HelloController {

    /**
     * 依赖注入
     * @return
     */
    /*@Autowired
    private HelloService helloService;*/

    /**
     * 构造注入
     * @return
     */
    private HelloService helloService;

    public HelloController(HelloService helloService){
        this.helloService = helloService;
    }

    @GetMapping(value = "/hello")
    public String greet(){
        helloService.greet();
        return "SUCCESS";
    }

}