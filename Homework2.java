public class Homework2 {
    public static void main(String[] args) {
        A2 find=new A2();
        String[]arr={"大黄","二哈","小白","皮皮"};
        System.out.println(find.find(arr,"哈"));
    }
}
class A2{
    public int find(String[]arr,String word){
        for(int i=0;i<arr.length;i++){
            if(word.equals(arr[i])){
                return i;
            }
        }
        return -1;
    }
}