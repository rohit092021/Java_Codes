// DISPLAY ALL NO ENTERED BY USER EXCEPT MULTIPLE OF 10.

package JavaQuestions;
import java.util.*;
public class display_all_no_except_multiple_of_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        do {

            int n = sc.nextInt();
            if (n % 10 == 0) {
               continue;
            }
            System.out.println(n);
        }
        while(true);
    }
}
