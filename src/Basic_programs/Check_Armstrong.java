package Basic_programs;
import java.util.*;
public class Check_Armstrong {
    public static void main(String[] args) {
        System.out.println("Enter no");
        int c,rem,arm=0;
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        c=n;
        while(n>0)
        {
            rem=n%10;
            arm=(rem*rem*rem)+arm;
            n=n/10;
        }
        if(c==arm)
            System.out.println("Armstrong");
        else
            System.out.println("not Armstrong");
    }
}
