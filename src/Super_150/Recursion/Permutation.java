package Super_150.Recursion;

public class Permutation {
    static int count=0;
    public static void main(String[] args) {
        String ques="abcde";
        printAnswer(ques,"");
        System.out.println(count);
    }
    public static void printAnswer(String ques, String ans){
        if(ques.length()==0){
            System.out.println(ans);
            count ++;
            return;
        }
        for(int i=0; i<ques.length();i++){
            String s1= ques.substring(0,i);
            String s2= ques.substring(i+1);
            char ch =ques.charAt(i);
            printAnswer(s1+s2, ans+ch);
        }
    }
}
