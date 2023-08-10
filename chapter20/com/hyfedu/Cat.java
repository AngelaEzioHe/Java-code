package com.hyfedu;

import java.sql.DataTruncation;

/**
 * @Author: EzioHe
 * @Date: 2023/7/21 22:24
 */
public class Cat {
    private String name = "招财猫";
    public int age = 10; //public的

    public Cat() {    }

    public Cat(String name) {
        this.name = name;
    }

    public void hi() {
        //System.out.println("hi " + name);
    }

    public void cry() {
        //System.out.println(name + "喵喵叫");
    }
}
