package Basic_programs;
import java.util.*;
public class Check_perfect {
    public static void main(String[] args) {
        System.out.println("enter no");
        int n,sum=0,i;
        Scanner obj = new Scanner(System.in);
        n= obj.nextInt();
        for(i=1;i<n;i++)
        {
            if(n%i==0)
            {
                sum+=i;
            }
        }
        if(n==sum)
            System.out.println("perfect");
        else
            System.out.println("not perfect");
    }
}
