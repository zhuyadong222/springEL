package com.maxrocky.main;

import com.maxrocky.config.TaskExecutorConfig;
import com.maxrocky.taskexecutor.TaskExecutorDemo;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author yado
 * @create 2018-05-10 16:52
 * @desc
 **/
public class main {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(TaskExecutorConfig.class);

        TaskExecutorDemo bean = context.getBean(TaskExecutorDemo.class);

        /**
         * 结果是并发执行而不是顺序执行
         */
        for(int i = 0; i <= 10; i++) {
            bean.executorAsyncTask(i);
            bean.executorAsyncTaskPlus(i);
        }

        context.close();

    }

}