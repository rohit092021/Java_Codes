package Super_150.Assignment_3;
import java.util.*;
public class Playing_with_Good_Strings {
    public static void main(String args[]) {
        // Your Code Here
        // String str = "cbaieklae";
        Scanner sc=new Scanner(System.in);
        String str= sc.next();
        System.out.println(PlayingGoodString(str));

    }

    public static int PlayingGoodString(String str) {

        int ans = 0;
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (isvowels(ch) == true) {
                count++;
            } else {
                ans = Math.max(ans, count);
                count = 0;
            }

        }
        ans = Math.max(ans, count);
        return ans;
    }

    public static boolean isvowels(char ch) {
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            return true;
        }
        return false;
    }
}
