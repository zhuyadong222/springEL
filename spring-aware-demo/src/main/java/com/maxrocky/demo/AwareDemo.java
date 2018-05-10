package com.maxrocky.demo;

import lombok.SneakyThrows;
import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ResourceLoaderAware;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.core.io.support.ResourcePatternResolver;
import org.springframework.core.io.support.ResourcePatternUtils;
import org.springframework.stereotype.Component;

/**
 * @author yado
 * @create 2018-05-10 10:14
 * @desc spring aware 示例
 **/
@Component
public class AwareDemo implements BeanNameAware, ResourceLoaderAware {

    /**
     *     1.实现BeanNameAware、ResourceLoaderAwaer接口，获得Bean名称和资源加载的服务
     *     2.实现ResourceLoaderAware需要重写setResourceLoader
     *     3.实现BeanNameAware需要重写setBeanName方法
     */
    private String beanName;

    private ResourceLoader resourceLoader;

    @Override
    public void setBeanName(String name) {
        this.beanName = name;
    }

    @Override
    public void setResourceLoader(ResourceLoader resourceLoader) {
        this.resourceLoader = resourceLoader;
    }

    @SneakyThrows
    public void outputResult(){
        System.out.println("Bean的名称为：" + beanName);
        Resource resource = resourceLoader.getResource("classpath:file/test.txt");
        System.out.println("ResourceLoader加载的文件内容为：" + IOUtils.toString(resource.getInputStream()));
    }

}