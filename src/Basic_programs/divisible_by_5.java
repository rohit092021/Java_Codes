package Basic_programs;
import java.util.*;
public class divisible_by_5 {
    public static void main(String[] args) {
        System.out.println("enter any no");
        int a;
        Scanner obj = new Scanner(System.in);
        a=obj.nextInt();
        if(a%5==0)
            System.out.println("divisible");
        else
            System.out.println("not divisible");
    }
}
