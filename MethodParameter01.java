public class MethodParameter01 {
    public static void main(String[] args) {
        Change change=new Change();
        int a=10;
        int b=20;
        change.change(a,b);
    }
}

class Change{
    public void change(int a,int b){
        System.out.println("a="+a+" b="+b);
        int temp;
        temp=a;
        a=b;
        b=temp;
        System.out.println("a="+a+" b="+b);
    }
}