package com.chen.log;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

public class Log implements MethodBeforeAdvice {


    //method:要执行的目标对象方法
    //args：参数
    @Override
    public void before(Method method, Object[] args, Object target) throws Throwable {

        System.out.println(target.getClass().getName()+"de"+method.getName()+"被执行了");
    }
}
