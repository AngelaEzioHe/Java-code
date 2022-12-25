public class RecursionExercise01 {
    public static void main(String[] args) {
        TT t1=new TT();
        System.out.println("当n=7时 对应的斐波那契数="+t1.fibonacci(7));
    }
}
class TT{
    public int fibonacci(int n){
        if (n>=1) {
            if(n==1 || n==2){
                return 1;
            }else{
                return fibonacci(n-1)+fibonacci(n-2);
            }
        } else {
            System.out.println("要求输入大于1的数");
            return -1;
        }
    }
}
