package Super_150.Recursion;

public class subsequence_of_string {
    public static void main(String[] args) {
    String str="abc";
    String ans="";
    subSeq(str, ans);
    }
    public static void subSeq(String str, String ans){
        if(str.length()==0){
            System.out.print(ans+" ");
            return;
        }
        char ch=str.charAt(0);
        subSeq(str.substring(1),ans);
        subSeq(str.substring(1),ans+ch);
    }
}
