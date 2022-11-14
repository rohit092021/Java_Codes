//*
//**
//***
//****
//*****

package JavaQuestions.Pattern_Question;
import java.util.*;
public class star_paattern {
    public static void main(String[] args) {
        System.out.println("enter no of rows");
        Scanner sc= new Scanner(System.in);
        int r = sc.nextInt();
        for(int i=1;i<=r;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println( );
        }
    }
}
