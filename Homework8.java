public class Homework8 { //公有类
    int count=9; //属性
    public void count1(){ //成员方法
        count=10;
        System.out.println("count1="+count);
    }
    public void count2(){ //成员方法
        System.out.println("count1="+(count++));
    }
    //这是 Homework8 的 main 方法,任何一个类，都可有 main
    public static void main(String[] args) {
        //1. new Homework8() 是匿名对象(只能用一次)
        //2. new Homework8().count1() 创建好匿名对象后，就调用count1()
        new Homework8().count1();
        Homework8 t1=new Homework8();
        t1.count2();
        t1.count2();
    }
}
