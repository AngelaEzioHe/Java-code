package com.hyfstu.encap;

public class AccountTest {
    public static void main(String[] args) {
        Account account = new Account();
        account.setName("jack");
        account.setBalance(50);
        account.setPwd("123456");
        account.showInfo();
    }
}
