public class MethodExercise01 {
    public static void main(String[] args) {
        AAA a=new AAA();
        if(a.IfOdd(2)){
            System.out.println("is odd number");
        }else{
            System.out.println("is even number");
        }
        a.print(20,40,'*');
    }
}

class AAA{
    public boolean IfOdd(int num){
        return num % 2 != 0;
    }
    public void print(int row,int column,char c){
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                System.out.print(c);
            }
            System.out.println();
        }
    }
}