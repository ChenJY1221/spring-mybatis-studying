package com.chen.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

//@Repository--dao
//@Controller
//@Service
//@Scope--作用域 单例模式、原型模式...
@Component
public class User {

    @Value("chen")
    public String name;
}
