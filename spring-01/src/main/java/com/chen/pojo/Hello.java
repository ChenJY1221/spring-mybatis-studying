package com.chen.pojo;

public class Hello {

    private String string;

    public String getString() {
        return string;
    }

    //用set注入
    public void setString(String string) {
        this.string = string;
    }

    @Override
    public String toString() {
        return "Hello{" +
                "string='" + string + '\'' +
                '}';
    }
}
