package Super_150.Assignment_3;
import java.util.*;
public class Strings_isPalindrome {
    public static void main(String args[]) {
        // Your Code Here
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        System.out.println(ispalindrome(str));

    }

    public static boolean ispalindrome(String str) {
        int i = 0;
        int j = str.length() - 1;
        while (i < j) {
            if (str.charAt(i) != str.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
