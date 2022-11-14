package Basic_programs;
import java.util.*;
public class factorial_of_a_no {
    public static void main(String[] args) {
        System.out.println("enter no");
        int fact=1;
        Scanner obj = new Scanner(System.in);
        int a=obj.nextInt();
        for(int i=1;i<=a;i++)
        {
            fact=i*fact;
        }
        System.out.println("Factorial is "+fact);

    }
}
