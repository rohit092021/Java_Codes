package Super_150.Recursion;
import java.util.Scanner;
public class Tower_of_Hanoi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        TowerOfHanoi(n,"A","B","C");
    }
    public static void TowerOfHanoi(int n, String A, String B, String C){
        if(n==0)
            return;
        TowerOfHanoi(n-1,A,C,B);
        System.out.println("Moving ring " + n + " from " + A +" to "+ B);
        TowerOfHanoi(n-1,C,B,A);
    }
}
