package com.hyfstu.super_;

public class B extends A{
    public void hi(){
        System.out.println(super.n1+" "+super.n2+" "+super.n3);
    }
    public void ok(){
        super.test100();
        super.test200();
        super.test300();
    }
    public B(){
        super("jack",10);
    }
}
