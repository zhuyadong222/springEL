package com.maxrocky.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * @author yado
 * @create 2018-05-10 17:42
 * @desc 配置类
 **/
@Configuration
@ComponentScan("com.maxrocky.scheduledtask")
//通过@EnableScheduling开启对任务计划的支持
@EnableScheduling
public class ScheduledTaskConfig {
}