//1
//12
//123
//1234
//12345


package JavaQuestions.Pattern_Question;
import java.util.*;
public class half_paramid_pattern {
    public static void main(String[] args) {
        System.out.println("enter no of rows");
        Scanner sc= new Scanner(System.in);
        int r = sc.nextInt();
        for(int i=1;i<=r;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(j);
            }
            System.out.println( );
        }
    }
}
