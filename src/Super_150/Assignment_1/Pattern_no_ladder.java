package Super_150.Assignment_1;
import java.util.*;
public class Pattern_no_ladder {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int count=1;
        for(int i=1;i<=N;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(count+" ");
                count++;
            }
            // count++;
            System.out.println();

        }
        // System.out.println();
        // Your Code Here
    }
}
