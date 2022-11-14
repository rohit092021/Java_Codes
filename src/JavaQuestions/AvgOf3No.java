package JavaQuestions;
import java.util.*;
public class AvgOf3No {
    public static void main(String[] args) {
        System.out.println("enter 3 no");
        Scanner sc = new Scanner(System.in);
        int a= sc.nextInt();
        int b= sc.nextInt();
        int c= sc.nextInt();
        int average = (a+b+c)/3;
        System.out.println("Average is "+average);
    }
}
