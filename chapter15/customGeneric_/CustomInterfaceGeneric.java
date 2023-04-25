package customGeneric_;

/**
 * @Author: EzioHe
 * @Date: 2023/4/25 21:39
 */
public class CustomInterfaceGeneric {
    public static void main(String[] args) {

    }
}

/**
 * 1.接口中，静态成员也不能使用泛型
 * 2.泛型接口的类型，在继承接口或者实现接口时确定
 */
interface IUsb<U, R> {
    int n = 10;

    R get(U u);

    void hi(R r);

    void run(R r1, R r2, U u1, U u2);

    default R method(U u) {
        return null;
    }
}

interface IA extends IUsb<String, Double> {

}

class AA implements IA {

    @Override
    public Double get(String s) {
        return null;
    }

    @Override
    public void hi(Double aDouble) {

    }

    @Override
    public void run(Double r1, Double r2, String u1, String u2) {

    }

}

class BB implements IUsb<Integer, Float> {

    @Override
    public Float get(Integer integer) {
        return null;
    }

    @Override
    public void hi(Float aFloat) {

    }

    @Override
    public void run(Float r1, Float r2, Integer u1, Integer u2) {

    }
}

class CC implements IUsb {


    @Override
    public Object get(Object o) {
        return null;
    }

    @Override
    public void hi(Object o) {

    }

    @Override
    public void run(Object r1, Object r2, Object u1, Object u2) {

    }
}