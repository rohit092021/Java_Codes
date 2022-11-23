package Super_150.Assignment_1;
import java.util.*;
public class Binary_to_Decimal {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int sum=0;
        int mul=1;
        while(num>0)
        {
            int rem=num%10;
            sum= sum+rem*mul;
            num=num/10;
            mul=mul*2;
        }
        System.out.println(sum);

    }
}
