package JavaQuestions.Function_question;

import java.util.Scanner;

public class sum_by_parameter {
    public static int calculate_sum(int a, int b){
        int sum=a+b;
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a= sc.nextInt();
        int b= sc.nextInt();
        int sum=a+b;
        calculate_sum(a,b);
        System.out.println(sum);
    }
}
