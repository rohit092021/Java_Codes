package Basic_programs;
import java.util.*;
public class sum_of_all_odd_no {
    public static void main(String[] args) {
        System.out.println("enter the last no");
        Scanner obj = new Scanner(System.in);
        int sum=0;
        int a = obj.nextInt();
        if(a%2==1)
        {
             for(int i=1;i<=a;i+=2)
            {
                sum+=i;
            }

        }
        System.out.println("sum is " + sum);

    }
}
