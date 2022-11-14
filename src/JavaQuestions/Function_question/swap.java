package JavaQuestions.Function_question;
import java.util.Scanner;
public class swap {
    public static int swap_no(int a,int b){
        int c=a;
        a=b;
        b=c;
        System.out.println(a);
        System.out.println(b);
        return 0;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println(swap_no(a,b));
    }
}
