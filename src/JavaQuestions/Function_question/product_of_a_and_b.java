package JavaQuestions.Function_question;

import java.util.Scanner;

public class product_of_a_and_b {
    public static int product(int a, int b){
        int product=a*b;
        return product;
    }

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int product=a*b;
        product(a,b);
        System.out.println("product is "+product);
    }
}
