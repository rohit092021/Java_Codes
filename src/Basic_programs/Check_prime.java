package Basic_programs;
import java.util.*;
public class Check_prime {
    public static void main(String[] args) {
        System.out.println("enter no");
        int count=0,i;
        Scanner obj = new Scanner(System.in);
        int n =obj.nextInt();
        for(i=1;i<=n;i++)
        {
            if (n % i ==1)
            {
                count++;
            }
        }
            if(count==2)
                System.out.println("prime");
            else
                System.out.println("not prime");
        }

    }

