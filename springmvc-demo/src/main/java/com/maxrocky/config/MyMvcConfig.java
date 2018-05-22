package com.maxrocky.config;

import com.maxrocky.annotation.WiselyConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

/**
 * @author yado
 * @create 2018-05-14 17:42
 * @desc
 **/
@EnableWebMvc
@WiselyConfiguration(basePackages = "com.maxrocky")
public class MyMvcConfig {

    @Bean
    public InternalResourceViewResolver viewResolver(){
        InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
        //ecplise里面
        viewResolver.setPrefix("/WEB-INF/");
        viewResolver.setSuffix(".jsp");
        viewResolver.setViewClass(JstlView.class);
        return viewResolver;
    }

}