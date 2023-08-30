package com.hyfedu.reflection.homework;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * @Author: EzioHe
 * @Date: 2023/8/30 23:43
 */
public class homework01 {
    public static void main(String[] args) throws InstantiationException, IllegalAccessException, NoSuchFieldException, NoSuchMethodException {
        //1.得到 PrivateTest 类对应的 Class 对象
        Class<PrivateTest> privateTestClass = PrivateTest.class;
        //2。创建对象实例
        PrivateTest privateTestObj = privateTestClass.newInstance();
        //3.得到 name 属性对象
        Field name = privateTestClass.getDeclaredField("name");
        //4.爆破 name
        name.setAccessible(true);
        name.set(privateTestObj,"马超菜菜");
        //5.得到 getName 方法对象
        Method getName = privateTestClass.getMethod("getName");
        
    }
}

class PrivateTest{
    private String name="小龙";
    public String getName(){
        return name;
    }
}