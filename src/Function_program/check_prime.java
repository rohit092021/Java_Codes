package Function_program;
import java.util.*;
public class check_prime {
    public static void printPrime(int n) {
        int count=0,i;

        for(i=1;i<=n;i++)
        {
            if(n%i==0)
                count++;
        }
        if(count<=2)
        {
            System.out.println("prime");
        }
        else
            System.out.println("not prime");
    }

    public static void main(String[] args) {
        System.out.println("enter no");
        Scanner obj = new Scanner(System.in);
        int n=obj.nextInt();
        printPrime(n);
    }
}
