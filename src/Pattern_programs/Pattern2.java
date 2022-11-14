package Pattern_programs;
import java.util.*;
public class Pattern2 {
    public static void main(String[] args) {
        System.out.println("enter no of row and column");
        Scanner obj=new Scanner(System.in);
        int r=obj.nextInt();
        int c=obj.nextInt();
        for(int i=1;i<=r;i++)
        {
            for(int j=1;j<=c;j++) {
                if (i == 1 || j == 1 || i == r || j == c)
                {
                    System.out.print("*");
                }
                else
                    System.out.print(" ");
            }
            System.out.println( );
        }
    }
}
