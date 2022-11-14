package Basic_programs;
import java.util.*;
public class Sum_N_natural_no {
    public static void main(String[] args) {
        int a,i,sum=0;
        System.out.println("enter value of a");
        Scanner obj = new Scanner(System.in);
        a=obj.nextInt();
        for(i=1;i<=a;i++)
        {
            sum+=i;
        }
            System.out.println(sum);
    }
}
