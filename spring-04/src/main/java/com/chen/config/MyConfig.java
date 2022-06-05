package com.chen.config;

import com.chen.pojo.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

//相当于beans.xml
@Configuration
public class MyConfig {

    @Bean
    public User getUser() {
        return new User();
    }
}
