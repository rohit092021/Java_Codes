package Super_150.Assignment_3;
import java.util.*;
public class Strings_Difference_in_Ascii_Codes {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        String s = sc.next();
        System.out.print(asciiString(s));
        // Your Code Here
    }
    public static String asciiString(String s){
        StringBuilder sb= new StringBuilder();
        sb.append(s.charAt(0));
        for(int i=1;i<s.length();i++){
            char curr=s.charAt(i);
            char prev=s.charAt(i-1);
            int gap=curr-prev;
            sb.append(gap);
            sb.append(curr);
        }
        return sb.toString();
    }
}
