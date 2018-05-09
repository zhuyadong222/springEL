package com.maxrocky.event;

import lombok.Data;
import org.springframework.context.ApplicationEvent;

/**
 * @author yado
 * @create 2018-05-09 17:23
 * @desc 自定义事件
 **/
@Data
public class DemoEvent extends ApplicationEvent{

    /**
     *  spring的事件需要遵循如下流程：
     *      1.自定义事件，集成ApplicationEvent。
     *      2.定义事件监听器，实现ApplicationListener。
     *      3.使用容器发布事件。
     */

    private String msg;

    public DemoEvent(Object source, String msg) {
        super(source);
        this.msg = msg;
    }

}