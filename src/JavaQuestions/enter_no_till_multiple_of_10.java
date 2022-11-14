// KEEP ENTERING NO TILL THEN USER ENTER MULTIPLE OF 10.

package JavaQuestions;
import java.util.*;
public class enter_no_till_multiple_of_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        do {

                int n = sc.nextInt();
                if (n % 10 == 0) {
                    break;
                }
                System.out.println(n);
            }
            while(true);
        }
    }
