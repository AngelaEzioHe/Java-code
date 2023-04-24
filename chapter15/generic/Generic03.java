package generic;

/**
 * @Author: EzioHe
 * @Date: 2023/4/23 17:40
 */
public class Generic03 {
    public static void main(String[] args) {
        Person<String> person = new Person<String>("出生小龙");
        //相当于用 String 去替换 E
        Person<Integer> person1 = new Person<>(100);
    }
}

//泛型的作用是：可以在类声明时通过一个标识表示类中某个属性，或者是某个方法的返回值的类型，或者是参数类型
class Person<E> {
    E s; //E 表示 s 的数据类型，该数据类型在定义Person对象的时候指定，即在编译期间，就确定 E 是什么类型
    public Person(E s){ //E 也可以是参数类型
        this.s=s;
    }
    public E f(){ //返回类型使用 E 表示
        return s;
    }
}