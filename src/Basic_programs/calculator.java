package Basic_programs;
import java.util.*;
public class calculator {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int num1,num2,result;
        char operator;

        System.out.println("enter 1st no");
        num1 = obj.nextInt();

        System.out.println("enter operator");
        operator = obj.next().charAt(0);

        System.out.println("enter 2nd no");
        num2 = obj.nextInt();
        switch(operator)
        {
            case'+':
                System.out.println("Result is "+num1+num2);
                break;
            case'-':
                System.out.println(num1-num2);
                break;
            case'*':
                System.out.println("Result is "+num1*num2);
                break;
            case'/':
                System.out.println("Result is "+num1/num2);
                break;
            case'%':
                System.out.println("Result is "+num1%num2);
                break;
            default:
                System.out.println("Invalid Syntax");
        }

    }
}
