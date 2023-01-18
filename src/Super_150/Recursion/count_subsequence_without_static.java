package Super_150.Recursion;
public class count_subsequence_without_static {
    public static void main(String[] args) {
        String str="abc";
        String ans="";
//    subSeq(str, ans);
        System.out.println(subSeq(str,ans));
    }
    public static int subSeq(String str, String ans) {
        if (str.length() == 0) {
            System.out.println(ans+"-");
            return 1;
        }
        char ch = str.charAt(0);
        int a=subSeq(str.substring(1), ans);
        int b=subSeq(str.substring(1), ans + ch);
        return a+b;
    }
}


