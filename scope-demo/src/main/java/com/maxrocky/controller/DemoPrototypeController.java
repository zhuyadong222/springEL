package com.maxrocky.controller;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * @author yado
 * @create 2018-05-04 17:04
 * @desc 多例
 **/
@Component
@Scope("prototype")
public class DemoPrototypeController {
}