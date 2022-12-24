public class BubbleSort02 {
    public static void main(String[] args) {
        int[]arr={20,-1,89,2,890,7};
        System.out.println("==== 初始的元素序列 ====");
        for(int i=0;i<arr.length;i++){
            System.out.printf(arr[i]+"\t");
        }
        System.out.println();
        int temp;
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        System.out.println("==== 排序后的结果 ====");
        for(int i=0;i<arr.length;i++){
            System.out.printf(arr[i]+"\t");
        }
    }
}
