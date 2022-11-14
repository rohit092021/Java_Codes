package JavaQuestions;
import java.util.*;
public class check_leap_year {
    public static void main(String[] args) {
        System.out.println("enter year");
        Scanner sc= new Scanner(System.in);
        int year = sc.nextInt();
        if((year%4==0) && (year%400==0) && (year%100!=0))
        {
            System.out.println("Leap year");
        }
        else
            System.out.println("Not Leap Year");
    }
}
