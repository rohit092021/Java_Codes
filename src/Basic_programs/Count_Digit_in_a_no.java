package Basic_programs;
import java.util.*;
public class Count_Digit_in_a_no {
    public static void main(String[] args) {
        int count=0;
        System.out.println("Enter no");
        Scanner obj = new Scanner(System.in);
        int n=obj.nextInt();
        while(n>0)
        {
            n=n/10;
            count++;
        }
        System.out.println("Total Digits are "+count);

    }
}
