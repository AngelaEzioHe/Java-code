public class VarParameter01 {
    public static void main(String[] args) {
        HyfMethod hyfMethod=new HyfMethod();
        System.out.println(hyfMethod.add(1,5,100));;
    }
}
class HyfMethod{
//    public int add(int n1,int n2){
//        return (n1+n2);
//    }
//    public int add(int n1,int n2,int n3){
//        return n1+n2+n3;
//    }
//    public int add(int n1,int n2,int n3,int n4){
//        return n1+n2+n3+n4;
//    }
    //int...表示接受的是可变参数，类型是int
    //nums可当做数组
    public int add(int ...nums){
        System.out.println("接受元素个数="+nums.length);
        int res=0;
        for(int i=0;i<nums.length;i++){
            res+=nums[i];
        }
        return res;
    }
}
