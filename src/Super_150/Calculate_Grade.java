package Super_150;
import java.util.*;
public class Calculate_Grade {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int marks=sc.nextInt();
        if(marks>=75)
        {
            System.out.println("Grade A");
        }
        else if(marks>=65)
        {
            System.out.println("Grade B");
        }
        else if(marks>=55)
        {
            System.out.println("Grade C");
        }
        else if(marks>=45)
        {
            System.out.println("Pass");
        }
        else
            System.out.println("Fail");

    }
}
