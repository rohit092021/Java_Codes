package Pattern_programs;
import java.util.*;
public class pattern4 {
    public static void main(String[] args) {
        System.out.println("enter no of row and column");
        Scanner obj = new Scanner(System.in);
        int r = obj.nextInt();
        int c = obj.nextInt();
        for (int i = r; i >=c ; i--) {
            for (int j = 1; j <= i; j++) {

                System.out.print("*");
            }
            System.out.println();
        }
    }
}
