public class Homework6 {
    public static void main(String[] args) {
        Cale cale=new Cale(2,8);
        System.out.println("和="+cale.sum());
        System.out.println("差="+cale.minus());
        System.out.println("积="+cale.mul());
        Double divRes=cale.div();
        if (divRes != null) {
            System.out.println("商="+divRes);
        }
    }
}
class Cale{
    double num1;
    double num2;
    public Cale(double num1,double num2){
        this.num1=num1;
        this.num2=num2;
    }
    public double sum(){
        return num1+num2;
    }
    public double minus(){
        return num1-num2;
    }
    public double mul(){
        return num1*num2;
    }
    public Double div(){
        if(num2==0){
            System.out.println("num2不能为0");
            return null;
        } else{
            return num1/num2;
        }

    }
}