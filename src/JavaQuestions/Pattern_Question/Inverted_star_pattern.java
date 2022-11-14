//*****
//****
//***
//**
//*


package JavaQuestions.Pattern_Question;
import java.util.Scanner;
public class Inverted_star_pattern {
    public static void main(String[] args) {
        System.out.println("enter no of rows");
        Scanner sc= new Scanner(System.in);
        int r = sc.nextInt();
        for(int i=1;i<=r;i++)
        {
            for(int j=1;j<=r-i+1;j++)
            {
                System.out.print("*");
            }
            System.out.println( );
        }
    }
}
