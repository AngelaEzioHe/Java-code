public class OverLoadExercise {
    public static void main(String[] args) {
        Methods method=new Methods();
        method.m(4);
        method.m(3,5);
        method.m("大三实习");
        System.out.println(method.max(10,24));
        System.out.println(method.max(10.0,21.4));
        System.out.println(method.max(10.0,21.4,30));
    }
}
class Methods{
    public void m(int n){
        System.out.println("平方="+(n*n));
    }
    public void m(int m,int n){
        System.out.println("相乘="+(n*m));
    }
    public void m(String str){
        System.out.println("字符串为:"+str);
    }
    public int max(int a,int b){
        if(a>=b){
            return a;
        } else {
            return b;
        }
    }
    public double max(double a,double b){
        if(a>=b){
            return a;
        } else {
            return b;
        }
    }
    public double max(double a,double b,double c){
        double temp=(a>b)?a:b;
        return (temp>c)?temp:c;
    }
}