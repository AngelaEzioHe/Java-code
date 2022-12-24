public class Method01 {
    public static void main(String[] args) {
        /*
            1.方法写好后，如果不去调用(使用)，不会输出。
            2.先创建对象，然后调用方法
         */
        person2 p1=new person2();
        p1.speak(); //调用方法
        p1.cal01();
        p1.cal02(5);
        System.out.println("两数和="+p1.add(2,3));
    }
}

class  person2{
    String name;
    int age;
    /*
        1.public 表示方法是公开的
        2.void 表示没有返回值
        3.speak 是方法名
        4.() 是形参列表
        5.{} 是方法体，可以写要执行的代码
     */
    public void speak(){
        System.out.println("我是一个好人");
    }
    public void cal01(){
        int result=0;
        for(int i=1;i<=1000;i++){
            result+=i;
        }
        System.out.println("cal01计算结果="+result);
    }
    public void cal02(int n){
        int result=0;
        for(int i=1;i<=n;i++){
            result+=i;
        }
        System.out.println("cal02计算结果="+result);
     }
     public int add(int num1,int num2){
        int result=num1+num2;
        return result;
     }
}
