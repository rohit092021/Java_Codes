package Super_150.LEC_6.java;

import java.util.Scanner;

public class Decimal_Hexa {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int sum=0;
        int mul=1;
        while(num>0)
        {
            int rem=num%6;  //source
            sum= sum+rem*mul;
            num=num/6;   //source
            mul=mul*10;  //destination
        }
        System.out.println(sum);
    }
}

