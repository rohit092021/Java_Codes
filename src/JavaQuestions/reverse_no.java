package JavaQuestions;
import java.util.*;
public class reverse_no {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int lastDigit,rev=0;
        int n = sc.nextInt();
        while(n>0){
            lastDigit=n%10;
            rev=(rev*10)+lastDigit;

            n=n/10;
        }
        System.out.println(rev);
    }
}
