package Super_150.Recursion;

import java.util.Scanner;

public class print_n_to_1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        printNum(n);
    }
    public static void printNum(int n){
        if(n==1){
            System.out.println(1);
            return;
        }
        System.out.println(n);
        printNum(n-1);
        System.out.println(n);
    }
}
