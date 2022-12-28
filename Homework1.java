public class Homework1 {
    public static void main(String[] args) {
        double[]arr={65.3,2.3,6.34,78.3,};
        max max=new max();
        System.out.println("数组arr中最大的元素="+max.max(arr));
    }
}
class max{
    public double max(double[]arr){
        double max=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>=max){
                max=arr[i];
            }
        }
        return max;
    }
}