package Basic_programs;
import java.util.*;
public class greatest_bet_2 {
    public static void main(String[] args) {
        System.out.println("enter 2 no");
        Scanner obj = new Scanner(System.in);
        int a=obj.nextInt();
        int b=obj.nextInt();
        if(a>b)
            System.out.println("a is greater");
        else System.out.println("b is greater");
    }
}
