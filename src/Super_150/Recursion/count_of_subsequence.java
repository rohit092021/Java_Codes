package Super_150.Recursion;

public class count_of_subsequence {
    public static void main(String[] args) {
        String str="abc";
        String ans="";
        subSeq(str, ans);
        System.out.println(count);
    }
    static int count=0;
    public static void subSeq(String str, String ans){
        if(str.length()==0){
            System.out.print(ans+" ");
            count++;
            return;
        }
        char ch=str.charAt(0);
        subSeq(str.substring(1),ans);
        subSeq(str.substring(1),ans+ch);
    }
//    static int count=0;
}
