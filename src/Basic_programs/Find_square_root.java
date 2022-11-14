package Basic_programs;
import java.util.*;
public class Find_square_root {
    public static void main(String[] args) {
        System.out.println("Enter no");
//        int
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        double a=Math.sqrt(n);
        System.out.println(a);
    }
}
