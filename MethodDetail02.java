public class MethodDetail02 {
    public static void main(String[] args) {
        A a=new A();
        a.sayOK();
        a.mi();
    }
}

class A{
    public void print(int n){
        System.out.println("print()方法被调用 n="+n);
    }
    public void sayOK(){
        print(10);
        System.out.println("继续执行sayOK()~~~");
    }
    public void mi(){
        System.out.println("m1() 方法被调用");
        B b=new B();
        b.hi();
        System.out.println("m1() 继续执行");
    }
}

class B{
    public void hi(){
        System.out.println("B类中的 hi()被执行");
    }
}