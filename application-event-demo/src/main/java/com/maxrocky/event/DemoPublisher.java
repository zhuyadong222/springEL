package com.maxrocky.event;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

/**
 * @author yado
 * @create 2018-05-09 17:31
 * @desc 事件发布类
 **/
@Component
public class DemoPublisher {

    /**
     *  1.注入ApplicationContext用来发布事件
     *  2.使用ApplicationContext的publishEvent方法来发布
     */
    @Autowired
    ApplicationContext applicationContext;

    public void publish(String msg) {
        applicationContext.publishEvent(new DemoEvent(this, msg));
    }

}