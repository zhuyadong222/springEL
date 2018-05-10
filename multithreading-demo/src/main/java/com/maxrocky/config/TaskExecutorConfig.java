package com.maxrocky.config;

import org.springframework.aop.interceptor.AsyncUncaughtExceptionHandler;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.AsyncConfigurer;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

import java.util.concurrent.Executor;

/**
 * @author yado
 * @create 2018-05-10 16:29
 * @desc 配置类
 **/
@Configuration
@ComponentScan("com.maxrocky.taskexecutor")
@EnableAsync
public class TaskExecutorConfig implements AsyncConfigurer {

    /**
     *  1.利用@EnableAsync注解开启异步任务支持
     *  2.配置类实现了AsyncConfigurer接口并重写了getAsyncExecutor方法，并返回一个ThreadPoolTaskExecutor，
     *      这样我们就获得了一个基于线程池TaskExecutor
     */

    @Override
    public Executor getAsyncExecutor(){
        ThreadPoolTaskExecutor taskExecutor = new ThreadPoolTaskExecutor();
        taskExecutor.setCorePoolSize(5);
        taskExecutor.setMaxPoolSize(10);
        taskExecutor.setQueueCapacity(25);
        taskExecutor.initialize();
        return taskExecutor;
    }

    @Override
    public AsyncUncaughtExceptionHandler getAsyncUncaughtExceptionHandler() {
        return null;
    }

}