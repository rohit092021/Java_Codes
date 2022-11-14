package Function_program;
import java.util.Scanner;
public class new_sum {
    public static int calculateSum(int a, int b)
    {
        int sum=a+b;
        return sum;
    }

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("enter 1st and 2nd no");
        int a = obj.nextInt();
        int b =obj.nextInt();
        int sum = calculateSum(a,b);
        System.out.println("sum is : "+sum);
    }
}
