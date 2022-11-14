package CLASSES_150.LEC_6.java;
import java.util.*;
public class    Decimal_Binary {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int sum=0;
        int mul=1;
        while(num>0)
        {
            int rem=num%2;
            sum= sum+rem*mul;
            num=num/2;
            mul=mul*10;
        }
        System.out.println(sum);
    }
}
