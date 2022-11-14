package Basic_programs;
import java.util.*;
public class reverse_a_no {
    public static void main(String[] args) {
        System.out.println("Enter no");
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        while(n>0)
        {
            int r=n%10;
            System.out.println("reverse no "+r);
            n=n/10;
        }
    }
}
