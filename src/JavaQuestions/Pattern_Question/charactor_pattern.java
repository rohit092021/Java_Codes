//A
//BC
//DEF
//GHIJ
//KLMNO

package JavaQuestions.Pattern_Question;
import java.util.Scanner;
public class charactor_pattern {
    public static void main(String[] args) {
        System.out.println("enter no of rows");
        Scanner sc= new Scanner(System.in);
        int r = sc.nextInt();
        System.out.println("enter character");
        char ch = sc.next().charAt(0);
        for(int i=1;i<=r;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(ch);
                ch++;
            }
            System.out.println( );
        }
    }
}
