public class Homework3 {
    public static void main(String[] args) {
        A3 updatePrice=new A3("《高等数学》",300);
        updatePrice.updatePrice();
        updatePrice.info();
    }
}
class A3{
    String name;
    double price;
    public A3(String name,double price){
        this.price=price;
        this.name=name;
    }
    public void updatePrice(){
        if(this.price > 150){
            this.price=150;
        } else if(price >100) {
            this.price=100;
        }
    }
    //显示书籍情况
    public void info(){
        System.out.println("书名="+this.name+" 价格="+this.price);
    }
}