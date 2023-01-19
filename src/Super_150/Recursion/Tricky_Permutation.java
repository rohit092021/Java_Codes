package Super_150.Recursion;
public class Tricky_Permutation {
    public static void main(String[] args) {
        String ques="aba";
        printAnswer(ques,"");
    }
    public static void printAnswer(String ques, String ans){
        if(ques.length()==0){
            System.out.println(ans);
            return;
        }
        for(int i=0; i<ques.length();i++){
            char ch=ques.charAt(i);
            boolean flag=true;
            for(int j=i+1;j<ques.length();j++){
                if(ques.charAt(j)==ch){
                    flag=false;
                    break;
                }
            }
            String s1= ques.substring(0,i);
            String s2= ques.substring(i+1);
//            char ch =ques.charAt(i);
            printAnswer(s1+s2, ans+ch);
        }
    }
}
