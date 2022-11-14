package CLASSES_150.Function;

import java.util.Scanner;

public class return_type {
    static int val=100;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println(addition(a,b));
        System.out.println(val);
    }
    public static int addition(int a, int b){
        int c=a+b;
        int val=90;
        val+=5;
        return_type.val=val+5;
       return c;
    }
}

