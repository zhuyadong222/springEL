package com.maxrocky.demo.config;

import lombok.SneakyThrows;
import org.apache.commons.io.IOUtils;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.Environment;
import org.springframework.core.io.Resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

/**
 * @author yado
 * @create 2018-05-08 9:53
 * @desc 配置类
 **/
@Configuration
@ComponentScan("com.maxrocky.demo")
//注入配置文件
@PropertySource("classpath:file/test.txt")
@RestController
public class ElConfig {

    //1.注入普通字符串
    @Value("I love you!")
    private String normal;

    //2.注入操作系统属性
    @Value("#{systemProperties['os.name']}")
    private String osName;

    //3.注入表达式结果
    @Value("#{ T(java.lang.Math).random() * 100.0}")
    private double randomName;

    //也可以配置在配置文件中 这里的int可以换成string
    @Value("${random.int(10)}")
    private int randomInt;

    /**
     * 没有random.double和random.float类型，他们产生的数值跟random.num一样，都是随机字符串
     */
    @Value("${random.double}")
    private String randomDouble;

    @Value("${random.float}")
    private String randomFloat;

    @Value("${random.num}")
    private String num;

    //4.注入其他bean属性
    @Value("#{demo.value}")
    private String fromValue;

    //5.注入文件资源
    @Value("classpath:file/test.txt")
    private Resource testFile;

    //6.注入网址资源
    @Value("https://www.baidu.com")
    private Resource testUrl;

    //7.注入配置文件
    @Value("${book.name}")
    private String bookName;

    @Autowired
    private Environment environment;

    /**
     *  注入配置文件需要使用@PropertySource指定文件地址，若使用@Value注入，
     *      则要配置一个PropertySourcesPlaceholderConfigurer的Bean。
     *  注意： @Value("${book.name}")使用的是"$"，而不是"#"。
     *      注入Proerties还可从Environment中获得
     */
    //去掉也可以正常运行
//    @Bean
//    public static PropertySourcesPlaceholderConfigurer propertyCoonfigure(){
//        return new PropertySourcesPlaceholderConfigurer();
//    }

    //测试输入异常
    @SneakyThrows
    @Test
    public void outputResource(){
        System.out.println("1.注入普通字符串:" + normal);
        System.out.println("2.注入操作系统属性:" + osName);
        System.out.println("3.注入表达式结果:" + randomName);
        System.out.println("testInt:" + randomInt);
        System.out.println("testDouble:" + randomDouble + "；testFloat: " +randomFloat+"；num:" +num);
        System.out.println("4.注入其他bean属性:" + fromValue);
        System.out.println("5.注入文件资源:" + IOUtils.toString(testFile.getInputStream()));
        System.out.println("6.注入网址资源:" + IOUtils.toString(testUrl.getInputStream()));
        System.out.println("7.注入配置文件:" + bookName);
        System.out.println(environment.getProperty("book.author"));
    }

    //http请求也可以正常输出
    @GetMapping("/get")
    public String get(){
        outputResource();
        return "SUCCESS";
    }

}