package JavaQuestions;
import java.util.*;
public class even_odd_by_ternary {
    public static void main(String[] args) {
        System.out.println("enter no");
        Scanner sc = new Scanner(System.in);
        int no = sc.nextInt();
        String result = (no%2==0)?"even":"odd";
        System.out.println(result);
    }
}
