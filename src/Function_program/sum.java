package Function_program;
import org.w3c.dom.ls.LSOutput;

import java.util.*;
public class sum {
    public static void main(String[] args) {
        sum();
        sum();
        sum();
    }
    static void sum() {
        System.out.println("enter 1stand 2nd no");
        Scanner obj = new Scanner(System.in);
        int a = obj.nextInt();
        int b = obj.nextInt();
        int sum = a + b;
        System.out.println("sum is " + sum);
    }
}
