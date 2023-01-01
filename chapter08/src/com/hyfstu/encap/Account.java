package com.hyfstu.encap;

public class Account {
    private String name;
    private double balance;
    private String pwd;

    public Account() {
    }

    public Account(String name, double balance, String pwd) {
        this.setName(name);
        this.setBalance(balance);
        this.setPwd(pwd);
    }

//    public String getName() {
//        return name;
//    }

    public void setName(String name) {

        if (name.length() >= 2 && name.length() <= 4) {
            this.name = name;
        } else {
            System.out.println("名字长度有误，给你默认为‘无名氏’");
            this.name = "无名氏";
        }
    }

//    public double getBalance() {
//        return balance;
//    }

    public void setBalance(double balance) {
        if (balance >= 20) {
            this.balance = balance;
        } else {
            System.out.println("要求余额>20 默认为0");
            this.balance = 0;
        }
    }

//    public String getPwd() {
//        return pwd;
//    }

    public void setPwd(String pwd) {
        if (pwd.length() == 6) {
            this.pwd = pwd;
        } else {
            System.out.println("密码必须是6位，默认密码 000000");
            this.pwd = "000000";
        }
    }

    public void showInfo() {
        System.out.println("账号信息 name=" + name + " 余额=" + balance + " 密码=" + pwd);
    }
}