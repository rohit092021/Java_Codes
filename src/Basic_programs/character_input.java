package Basic_programs;
import java.util.*;
public class character_input {
    public static void main(String[] args) {
        System.out.println("enter no");
        char a;
        int b;
        Scanner obj = new Scanner(System.in);
        a=obj.next().charAt(0);
        b=a;
        System.out.println(b);

    }
}

