public class VarParameterExercise {
    public static void main(String[] args) {
        hyf hyf=new hyf();
        System.out.println(hyf.showScore("milan",90.1,80.0));
        System.out.println(hyf.showScore("terry",90.1,80.0,30.5,70.0));
    }
}
class hyf{
    public String showScore(String name,double...scores){
        double totalScore=0;
        for(int i=0;i<scores.length;i++){
            totalScore+=scores[i];
        }
        return name+"有"+scores.length+"门课程总分为："+totalScore;
    }
}