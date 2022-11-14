package Basic_programs;
import java.util.Scanner;
public class Sum_of_digit {
    public static void main(String[] args) {
        int sum=0,rem;
        System.out.println("Enter no");
        Scanner obj = new Scanner(System.in);
        int n=obj.nextInt();
        while(n>0)
        {
            rem=n%10;
            sum+=rem;
            n=n/10;
        }
        System.out.println("Total Sum is : "+sum);

    }
}
