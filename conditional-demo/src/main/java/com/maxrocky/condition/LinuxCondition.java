package com.maxrocky.condition;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

/**
 * @author yado
 * @create 2018-05-11 11:39
 * @desc 判定Linux的条件
 **/
public class LinuxCondition implements Condition {

    /**
     *  Windows系统下列表命令为dir
     *  Linux系统下列表命令为ls
     */

    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
        return context.getEnvironment().getProperty("os.name").contains("Linux");
    }

}