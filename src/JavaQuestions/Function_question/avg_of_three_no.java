package JavaQuestions.Function_question;

import java.util.Scanner;

public class avg_of_three_no {
    public static int avg(int a,int b,int c)
    {
        int avg=(a+b+c)/3;
        return avg;
    }

    public static void main(String[] args) {
        System.out.println("enter 3 no");
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        avg(a,b,c);
        System.out.println(avg(a,b,c));
    }
}
