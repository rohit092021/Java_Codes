package Basic_programs;
import java.util.*;
public class Check_palindrome {
    public static void main(String[] args) {
        System.out.println("Enter no");
        int r,s=0,c;
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        c=n;
        while(n>0)
        {
            r=n%10;
            s=(s*10)+r;
            n=n/10;
        }
        if(c==s)
        {
            System.out.println("palindrome");
        }
        else
        {
            System.out.println("not");
        }
    }
}
