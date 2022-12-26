public class OverLoad01 {
    public static void main(String[] args) {
        MyCalculator myCalculator=new MyCalculator();
        System.out.println(myCalculator.calculate(3,3));
        System.out.println(myCalculator.calculate(3.3,4));
        System.out.println(myCalculator.calculate(6,3.3));
        System.out.println(myCalculator.calculate(1,2,3));
    }
}
class MyCalculator{
    public int calculate(int n1,int n2){
        return (n1+n2);
    }
    public double calculate(int n1,double n2){
        return (n1+n2);
    }
    public double calculate(double n1,int n2){
        return (n1+n2);
    }
    public int calculate(int n1,int n2,int n3){
        return (n1+n2+n3);
    }
}
