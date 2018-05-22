package com.maxrocky.config;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration.Dynamic;

/**
 * @author yado
 * @create 2018-05-14 17:53
 * @desc web配置
 **/
/**
 *  1.WebApplicationInitializer 是Spring提供用来配置Servlet3.0+配置的接口，
 *      从而实现了替代web.xml的位置。实现此接口将会自动被
 *      SpringServletContainerInitializer（用来启动Servlet3.0容器）获取到
 */
public class WebInitializer implements WebApplicationInitializer {

    @Override
    public void onStartup(ServletContext servletContext) throws ServletException {
        AnnotationConfigWebApplicationContext context = new AnnotationConfigWebApplicationContext();
        context.register(MyMvcConfig.class);
        //2.新建WebApplicationContext,注册配置类，并将其和当前servletContext关联
        context.setServletContext(servletContext);

        //3.注册Spring MVC的DispatcherServlet
        Dynamic servlet = servletContext.addServlet("dispatcher", new DispatcherServlet(context));
        servlet.addMapping("/");
        servlet.setLoadOnStartup(1);
    }
}