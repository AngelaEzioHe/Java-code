package generic.improve;

import java.util.ArrayList;

/**
 * @Author: EzioHe
 * @Date: 2023/4/22 23:56
 */
@SuppressWarnings({"all"})
public class Generic02 {
    public static void main(String[] args) {
        //使用泛型
        ArrayList<Dog> arrayList = new ArrayList<Dog>();
        arrayList.add(new Dog("旺财", 10));
        arrayList.add(new Dog("发财", 1));
        arrayList.add(new Dog("小龙", 5));
        //编译器会报错
        //arrayList.add(new Cat("招财", 8));

        for (Dog o :arrayList) {
            System.out.println(o.getName()+"-"+o.getAge());
        }

    }
}

class Dog {
    private String name;
    private int age;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

class Cat {
    private String name;
    private int age;

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}