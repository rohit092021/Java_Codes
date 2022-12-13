package Super_150.Assignment_3;
import java.util.*;
public class Strings_Toggle_Case {
    public static void main(String args[]) {
        // Your Code Here
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        for (int i = 0; i < s.length(); i++) {


            if (s.charAt(i) >= 65 && s.charAt(i) <= 90) {
                char a = (char) ((int) s.charAt(i) + 32);
                System.out.print(a);
            } else {
                char b = (char) ((int) s.charAt(i) - 32);
                System.out.print(b);
            }

        }
    }
}
