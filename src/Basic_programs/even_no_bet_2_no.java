package Basic_programs;
import java.util.*;
public class even_no_bet_2_no {
    public static void main(String[] args) {
        System.out.println("enter no");
        int a, i;
        Scanner obj = new Scanner(System.in);
        a = obj.nextInt();
        int b = obj.nextInt();

        for (i = a; i <= b; i++)
        {
            if(i%2==0)
            System.out.println(i);
        }
    }
}
