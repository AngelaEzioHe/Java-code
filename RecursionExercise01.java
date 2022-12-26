public class RecursionExercise01 {
    public static void main(String[] args) {
        TT t1=new TT();
        System.out.println("当n=7时 对应的斐波那契数="+t1.fibonacci(7));
        int day=1;
        int peachNum=t1.peach(day);
        if(peachNum!=-1){
            System.out.println("第"+day+"天原本有"+peachNum+"个桃子");
        }
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
    public int peach(int day){
        if(day==10){
            return 1;
        } else if (day>=1 && day <=9) {
            return (peach(day+1)+1)*2;
        }else {
            System.out.println("day在1-10");
            return -1;
        }
    }
}
