package Super_150.Bit_Manipulation;
import java.util.*;
public class check_even_odd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int bit=1;
        if((n & bit) ==0){
            System.out.println("Even");
        }
        else
            System.out.println("odd");
    }
}
