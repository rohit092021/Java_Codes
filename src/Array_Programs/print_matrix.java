package Array_Programs;
import java.util.*;
public class print_matrix {
    public static void main(String[] args) {
        System.out.println("enter no of rows and column");
        int row,col;
        Scanner obj = new Scanner(System.in);
        row = obj.nextInt();
        col = obj.nextInt();

        int num[][] = new int[row][col];
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                num[i][j]=obj.nextInt();
            }
        }
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<row;j++)
            {
                System.out.print(num[i][j] +" ");
            }
            System.out.println();
        }


    }
}
