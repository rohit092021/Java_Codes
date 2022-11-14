package Basic_programs;
import java.util.*;
public class power_of_a_no {
    public static void main(String[] args) {
        int result=1;
        System.out.println("Enter no");
        Scanner obj = new Scanner(System.in);
        int n=obj.nextInt();
        System.out.println("enter power");
        int p=obj.nextInt();
        for(int i=1;i<=p;i++)
        {
            result = result*n;
        }
        System.out.println(result);
    }
}
