package customGeneric_;

import java.util.Arrays;

/**
 * @Author: EzioHe
 * @Date: 2023/4/24 23:54
 */
public class CustomGeneric_ {
    public static void main(String[] args) {
        Tiger<Double, String, Integer> g = new Tiger<>("john");
        g.setT(10.9);
        System.out.println(g);
    }
}

class Tiger<T, R, M> {
    String name;
    R r;
    M m;
    T t;

    T[] ts;

    public Tiger(String name){
        this.name=name;
    }

    public Tiger( R r, M m, T t) {
        String name;
        this.r = r;
        this.m = m;
        this.t = t;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public R getR() {
        return r;
    }

    public void setR(R r) {
        this.r = r;
    }

    public M getM() {
        return m;
    }

    public void setM(M m) {
        this.m = m;
    }

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

    @Override
    public String toString() {
        return "Tiger{" +
                "name='" + name + '\'' +
                ", r=" + r +
                ", m=" + m +
                ", t=" + t +
                ", ts=" + Arrays.toString(ts) +
                '}';
    }
}