package Function_program;
import java.util.*;
public class multiply {
    public static int calculateMultiply(int a, int b)
    {
        int multiply = a*b;
        return multiply;
    }

    public static void main(String[] args) {
        System.out.println("enter 1st and 2nd no");
        Scanner obj = new Scanner (System.in);
        int a =obj.nextInt();
        int b =obj.nextInt();
        int multiply = calculateMultiply (a,b);
        System.out.println("Multiply is : "+multiply);
    }
}
