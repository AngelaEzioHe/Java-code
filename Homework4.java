public class Homework4 {
    public static void main(String[] args) {
        int[]oldArr={10,30,50};
        A4 a4=new A4();
        int[]newArr=a4.copyArr(oldArr);
        for(int i=0;i< newArr.length;i++){
            System.out.print(newArr[i]+" ");
        }
    }
}
class A4{
    public int[] copyArr(int[]oldArr){
        int[]newArr=new int[oldArr.length];
        for(int i=0;i<oldArr.length;i++){
            newArr[i]=oldArr[i];
        }
        return newArr;
    }
}