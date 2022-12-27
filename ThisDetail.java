public class ThisDetail {
    public static void main(String[] args) {
        H h1=new H();
        h1.f2();
    }
}
class H{
    public H(){
        //this关键字必须放在第一条语句
        this("jack",100);
        System.out.println("H() 构造器");
    }
    public H(String name,int age){
        System.out.println("H(String name,int age) 构造器");
    }
    public void f1(){
        System.out.println("f1() 方法..");
    }
    public void f2(){
        System.out.println("f2() 方法..");
        f1();
        this.f1();
    }
}
