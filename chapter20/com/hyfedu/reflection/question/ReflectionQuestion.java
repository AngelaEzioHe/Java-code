package com.hyfedu.reflection.question;

import com.hyfedu.Cat;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;

/**
 * @Author: EzioHe
 * @Date: 2023/7/21 22:28
 */
public class ReflectionQuestion {
    public static void main(String[] args) throws IOException, ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        //根据配置文件 re.propertities 指定信息，创建Cat对象并调用方法hi

        //传统方式 new 对象 -> 调用方法
//        Cat cat = new Cat();
//        cat.hi();

        //尝试做一做 -> 明白反射

        //1.使用 Properties 类，可以读写配置文件
        Properties properties = new Properties();
        properties.load(new FileInputStream("src\\re.properties"));
        String classfullpath = properties.get("classfullpath").toString();
        String methodName = properties.get("method").toString();
        System.out.println("classfullpath="+classfullpath);
        System.out.println("method="+methodName);

        //2.创建对象，传统方法行不通 -> 反射机制

        //3.使用反射机制解决
        //(1)加载类，返回Class类型的对象
        Class cls = Class.forName(classfullpath);
        //(2)通过 cls 对象 得到你加载的类 com.hyf.edu.Cat 的对象实例
        Cat o = (Cat)cls.newInstance();
        System.out.println("o的运行类型="+o.getClass());
        //(3)通过 cls 得到你加载的类 com.hyfedu.Cat 的 methodName"hi" 的方法对象
        //   即:在反射中，可以把方法视为对象（万物皆对象）
         Method method1 = cls.getMethod(methodName);
         //(4)通过 method1调用方法:即通过方法对象来实现调用方法
        System.out.println("==================================");
        method1.invoke(o); //传统方法 对象.方法() ,反射机制 方法.invoke(对象)
    }
}
