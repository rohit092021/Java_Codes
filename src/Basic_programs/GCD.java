package Basic_programs;

import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
//        int G=0;
//        for(int i=1;i<=a; i++){
//            if(a%i==0 && b%i==0){
//                G=i;
//            }
//        }
//        System.out.println(G);

//        Another Best Way to Solve
        while(a%b !=0){
            int rem= a%b;
            a=b;
            b=rem;
        }
        System.out.println(b);
    }
}
