package JavaQuestions.Function_question;

import java.util.Scanner;

public class factorial {
    public static int find_factorial(int a) {
        int factorial = 1;
        for (int i = 1; i <= a; i++) {
            factorial *= i;
        }
        return factorial;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a =sc.nextInt();
       find_factorial(a);
        System.out.println("factorial is "+find_factorial(a));

        }
    }

