public class ArrayExercise01
{
    public static void main(String[] args)
    {
        char[] word = new char[26];
        for(int i=0;i<26;i++)
        {
            word[i]=(char)('A'+i);
        }
        for(int i=0;i<26;i++)
        {
            System.out.println(word[i]);
        }
    }
}
