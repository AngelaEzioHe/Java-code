package hyfstu.innerclass;

public class AnonymousInnerClass {
    public static void main(String[] args) {
        Outer04 outer04 = new Outer04();
        outer04.method();
    }
}

class Outer04 {
    private int n1 = 10;

    public void method() {

//        IA tiger = new Tiger();
//        tiger.cry();
        IA tiger=new IA(){
            @Override
            public void cry() {
                System.out.println("老虎叫唤...");
            }
        };
        tiger.cry();
        tiger.cry();
        tiger.cry();
        Father father=new Father("jack"){

        };
        System.out.println("father对象的运行类型="+father.getClass());
    }
}

interface IA {
    public void cry();
}

//class Tiger implements IA{
//    @Override
//    public void cry() {
//        System.out.println("老虎叫唤...");
//    }
//}
class Father {
    public Father(String name) {
    }

    public void test() {

    }
}