package Basic_programs;
import java.util.*;
public class factor_of_a_no {
    public static void main(String[] args) {
        System.out.println("enter no");
        Scanner obj = new Scanner(System.in);
        int n=obj.nextInt();
        for(int i=1; i<=n; i++)
        {
            if (n % i == 0)
                System.out.print(i + ",");
        }
    }
}
