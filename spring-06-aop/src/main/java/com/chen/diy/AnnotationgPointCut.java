package com.chen.diy;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect  //标注类为切面
public class AnnotationgPointCut {

    @Before("execution(* com.chen.service.UserServiceImpl.*(..))")
    public void before() {
        System.out.println("执行前");
    }

    @After("execution(* com.chen.service.UserServiceImpl.*(..))")
    public void after() {
        System.out.println("执行后");
    }

    @Around("execution(* com.chen.service.UserServiceImpl.*(..))")
    public void around(ProceedingJoinPoint joinPoint) {
        System.out.println("环绕前");

        //执行方法
        try {
            joinPoint.proceed();
        } catch (Throwable e) {
            e.printStackTrace();
        }

        System.out.println("环绕后");
    }
}
