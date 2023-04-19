package Super_150;

import java.util.Scanner;

public class Febonic_Series {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int a=0; // for a=0 index will start from 1 and for a = 1 index will start from 0
        int b=1;

        for(int i=1;i<=num;i++)
        {
           int c=a+b;
            a=b;
            b=c;
//            System.out.println(a);
        }
        System.out.println(a);
    }
}
