package CLASSES_150;

import java.util.Scanner;

public class Febonic_Series {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int a=0;
        int b=1;

        for(int i=1;i<=num;i++)
        {
           int c=a+b;
            a=b;
            b=c;
        }
        System.out.println(a);
    }
}
