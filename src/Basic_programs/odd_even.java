package Basic_programs;
import java.util.*;
public class odd_even {
    public static void main(String[] args) {
        int a;
        System.out.println("enter no");
        Scanner obj=new Scanner(System.in);
        a=obj.nextInt();
        if(a%2==0)
            System.out.println("even");
        else
            System.out.println("odd");

    }
}
