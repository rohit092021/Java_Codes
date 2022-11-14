package JavaQuestions.Function_question;

import java.util.Scanner;

public class check_palindrome {
    public static void main(String[] args) {
        System.out.println("enter no");
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int reverse=0;
        while(n>0)
        {
            reverse=n%10;
            System.out.print(reverse);
            n=n/10;
        }
        if(n==reverse)
        {
            System.out.println("palindrome");
        }
        else
            System.out.println("not");
    }

}
