package Basic_programs;
import java.util.*;
public class prime_between_two_no {
    public static void main(String[] args) {
        System.out.println("enter 1st no");
        int a, b, i,j;
        Scanner obj = new Scanner(System.in);
        a = obj.nextInt();
        System.out.println("enter 2nd no");
        b = obj.nextInt();
        for (i = a; i <= b; i++)
        {
            for(j=2;j<=i;j++)
            {
                if(i%j==0)
                break;
            }
            if(i==j)
                System.out.println(j);
        }

    }
}

