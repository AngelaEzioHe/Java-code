package com.hyfstu.extend_;

public class Sub extends Base{
    public Sub() {
        super("smith",10);
        System.out.println("子类sub()构造器被调用....");
    }
    public Sub(String name){
        super("tom",30);
        System.out.println("子类Sub(String name)构造器被调用....");
    }
    public void sayOK(){
        System.out.println("n1="+n1+" n2="+n2+" n3="+n3);
        test100();
        test200();
        test300();
        callTest400();
        System.out.println(getN4());
    }
}
