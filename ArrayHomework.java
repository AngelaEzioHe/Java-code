/*随机生成10个整数（1-100）保存到数组，
  并倒序打印以及求平均值、
  求最大值和最大值的下标、
  并查找里面是否有8
 */
public class ArrayHomework {
    public static void main(String[] args) {
        int[]arr=new int[10];
        for(int i=0;i<arr.length;i++) {
             arr[i]=(int)(Math.random()*100)+1;
        }
        System.out.println("====初始arr的元素情况====");
        for(int i=0;i<arr.length;i++){
            System.out.printf(arr[i]+"\t");
        }
        System.out.println("\n====修改后arr的元素情况====");
        for(int i=arr.length-1;i>=0;i--){
            System.out.printf(arr[i]+"\t");
        }
        System.out.println();
        double sum =arr[0];
        int max=arr[0];
        int maxIndex=0;
        for(int i=1;i<arr.length;i++){
            sum+=arr[i];
            if(max<arr[i]){
                max=arr[i];
                maxIndex=i;
            }
        }
        System.out.println("max="+max+"\tmaxIndex="+maxIndex);
        System.out.println("平均值为"+sum/10);
        int FindNum=8;
        int index=-1;
        for(int i=0;i<arr.length;i++){
            if(FindNum==arr[i]){
                System.out.println("找到数字8，下标为"+i);
                index=i;
                break;
            }
        }
        if(index==-1){
            System.out.println("没有找到8");
        }
    }
}
