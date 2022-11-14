package Basic_programs;
import java.util.*;
public class Add_2_no {
    public static void main(String[] args) {
        System.out.println("enter 2 no");
        int a,b;
        Scanner obj = new Scanner(System.in);
        a=obj.nextInt();
        b=obj.nextInt();
        int sum=a+b;
        System.out.println(sum);
    }
}
