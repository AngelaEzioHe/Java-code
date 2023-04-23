package generic;

/**
 * @Author: EzioHe
 * @Date: 2023/4/22 23:34
 */

import java.util.ArrayList;

/**
 * 编写程序，在 ArrayList 中，添加三个  Dog 对象
 * Dog 对象含有 name 和 age，并输出 name 和 age (要求使用 get×××())
 */
@SuppressWarnings({"all"})
public class Generic01 {
    public static void main(String[] args) {
        //使用传统方法来解决
        ArrayList arrayList = new ArrayList();
        arrayList.add(new Dog("旺财", 10));
        arrayList.add(new Dog("发财", 1));
        arrayList.add(new Dog("小龙", 5));
        //不小心添加一只猫
        //有异常
        arrayList.add(new Cat("招财", 8));

        //遍历
        for (Object o : arrayList) {
            //向下转型
            Dog dog = (Dog) o;
            System.out.println(dog.getName() + "-" + dog.getAge());
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