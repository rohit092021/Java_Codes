//package Super_150.Recursion;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class Generate_Parentheses {
//    public static void main(String[] args) {
//        int n=3;
//        List<String> ll=new ArrayList<>();
//        Parenthesis(n,"",0,0);
//        System.out.println(ll);
//    }
//    public static void Parenthesis(int n, String ans, int open, int close){
//        if(open==n && close == n){
////            System.out.println(ans+" ");
//            ll.add(ans);
//            return;
//        }
//        if(open < n){
//            Parenthesis(n, ans+"(", open+1, close);
//        }
//        if(close<open){
//            Parenthesis(n,ans + ")",open, close+1);
//        }
//
//    }
//}
