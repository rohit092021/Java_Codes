package Basic_programs;
import java.util.*;
public class Odd_no_between_2_no {
    public static void main(String[] args) {
        System.out.println("enter no");
        int a, i;
        Scanner obj = new Scanner(System.in);
        a = obj.nextInt();

        for (i = 1; i <= a; i+=2)
        {
                System.out.println(i);
        }
    }
}

