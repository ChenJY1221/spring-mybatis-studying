package com.chen.demo01;

//房东
public class Host implements Rent {
    @Override
    public void rent() {
        System.out.println("房东租房");
    }
}
