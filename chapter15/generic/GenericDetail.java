package generic;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: EzioHe
 * @Date: 2023/4/23 22:47
 */
public class GenericDetail {
    public static void main(String[] args) {
        //给泛型指向数据类型时，要求是引用类型，不能是基本数据类型
        List<Integer> list = new ArrayList<Integer>();

        Pig<A> aPig = new Pig<A>(new A());
        Pig<A> aPig2 = new Pig<A>(new B());
    }
}

class A {
}

class B extends A {
}

class Pig<E> {
    E e;

    public Pig(E e) {
        this.e = e;
    }
}