package com.maxrocky.bean;

import com.maxrocky.condition.LinuxCondition;
import org.springframework.context.annotation.Conditional;
import org.springframework.stereotype.Component;

/**
 * @author yado
 * @create 2018-05-11 14:16
 * @desc Linux下所需要创建的bean
 **/
@Component
@Conditional(LinuxCondition.class)
public class LinuxListDemo implements ListDemo {

    @Override
    public String showListCmd() {
        return "ls";
    }

}