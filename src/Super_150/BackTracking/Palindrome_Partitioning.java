package Super_150.BackTracking;
import java.util.*;
public class Palindrome_Partitioning {
    public static void main(String[] args) {
        String ques="nitin";
        List<String> ll = new ArrayList<>();
        List<List<String>> ans = new ArrayList<>();
        Partitioning(ques,ll,ans);
        System.out.println(ans);
    }
    public static void Partitioning(String ques, List<String> ll,List<List<String >>ans){
        if(ques.length()==0){
//            System.out.println(ll);
            ans.add(new ArrayList<>(ll));
            return;
        }
        for(int i=1;i<=ques.length();i++){
            String part=ques.substring(0,i);
            if(isPalindrome(part)) {
                ll.add(part);
                Partitioning(ques.substring(i),ll,ans);
                ll.remove(ll.size()-1);
            }
        }
    }
    public static boolean isPalindrome(String ques){
        int len=ques.length();
        for(int i=0; i<ques.length()/2; i++){
            if(ques.charAt(i) !=ques.charAt(len-1-i)){
                return false;
            }
        }
        return true;
    }
}