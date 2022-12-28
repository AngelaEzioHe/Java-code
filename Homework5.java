public class Homework5 {
    public static void main(String[] args) {
        A5 circle=new A5(2);
        System.out.println("面积="+circle.area());
        System.out.println("周长="+circle.C());
    }
}
class A5{
    double radius;
    public A5 (double radius){
        this.radius=radius;
    }
    public double area(){
        return Math.PI*radius*radius;
    }
    public double C(){
        return 2*Math.PI*radius;
    }
}