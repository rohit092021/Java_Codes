package Function_program;
import java.util.*;
public class factorial {
    public static void printFact(int a) {
        if(a<0)
        {
            System.out.println("invalid syntax");
            return;
        }
        int fact = 1;
        for (int i = 1; i <= a; i++){
            fact = fact * i;
    }
     System.out.println(fact);
     return;
}

    public static void main(String[] args) {
        System.out.println("enter no");
        Scanner obj = new Scanner(System.in);
        int a=obj.nextInt();
        printFact(a);

    }
}
