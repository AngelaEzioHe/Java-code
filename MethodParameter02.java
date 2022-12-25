public class MethodParameter02 {
    public static void main(String[] args) {
        BB b=new BB();
        int[]arr={1,2,3};
        b.test(arr);
    }
}
class BB{
    public void test(int[]arr){
        arr[0]=200;
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+"\t");
        }
    }
}