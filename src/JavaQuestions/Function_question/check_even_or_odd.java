package JavaQuestions.Function_question;
import java.util.Scanner;
public class check_even_or_odd {
    public static boolean isEven(int n)
    {
        if(n%2==0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println("enter number");
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        isEven(n);
        System.out.println(isEven(n));
    }
}

