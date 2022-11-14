package Pattern_programs;
import java.util.*;
public class pattern1 {
    public static void main(String[] args) {
        System.out.println("enter no of row and column");
        Scanner obj=new Scanner(System.in);
        int r=obj.nextInt();
        int c=obj.nextInt();
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                System.out.print("*");
            }
            System.out.println("*");
        }


    }
}
