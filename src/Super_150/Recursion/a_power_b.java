package Super_150.Recursion;
import java.util.Scanner;
public class a_power_b {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println(power(a,b));
    }
    public static int power(int a, int b){
        {
            if(b==0)
                return 1;
            else
                return (a*power(a,b-1));
        }
    }
}