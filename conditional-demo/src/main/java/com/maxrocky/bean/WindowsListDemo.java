package com.maxrocky.bean;

import com.maxrocky.condition.WindowsCondition;
import org.springframework.context.annotation.Conditional;
import org.springframework.stereotype.Component;

/**
 * @author yado
 * @create 2018-05-11 14:15
 * @desc Windows下所需要创建的bean
 **/
@Component
@Conditional(WindowsCondition.class)
public class WindowsListDemo implements ListDemo {

    @Override
    public String showListCmd() {
        return "dir";
    }

}