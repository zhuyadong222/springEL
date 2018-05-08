package com.maxrocky.demo;

import lombok.Data;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author yado
 * @create 2018-05-08 9:37
 * @desc 属性注入案例
 **/
@Component
@Data
public class Demo {

    //此处注入的是普通字符串
    @Value("其他类的属性")
    private String value;

    @Test
    public void test() {
        System.out.println(value);
    }

}