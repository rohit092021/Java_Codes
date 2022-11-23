package Super_150.Assignment_1;

import java.util.Scanner;
public class Sum_of_odd_and_even_placed_digit {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int odd_sum=0;
        int even_sum=0;
        int a=1;
        while(N!=0)
        {
            if(a%2==0)
                even_sum+=N%10;
            else
                odd_sum+=N%10;
            N/=10;
            a++;
        }
        System.out.println(odd_sum);
        System.out.println(even_sum);
    }
}
