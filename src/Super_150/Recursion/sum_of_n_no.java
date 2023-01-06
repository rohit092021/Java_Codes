package Super_150.Recursion;

import java.util.Scanner;

public class sum_of_n_no {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(sum(n));
    }
    public static int sum(int n){
        if(n==1){
            return 1;
        }
        int sm=sum(n-1);
        int SUM= n+sm;
        return SUM;
//        return n+sum(n-1);
    }
}
