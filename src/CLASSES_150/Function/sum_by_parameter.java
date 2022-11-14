package CLASSES_150.Function;
import java.util.*;
public class sum_by_parameter { public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    int b=sc.nextInt();
    addition(a,b);
}
    public static void addition(int a, int b){
        int c=a+b;
        sub(a,b);
        System.out.println(c);
    }
    public static void sub(int a, int b){
        int c=a-b;

        System.out.println(c);
    }
}

