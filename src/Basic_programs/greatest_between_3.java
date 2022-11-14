package Basic_programs;
import org.w3c.dom.ls.LSOutput;

import javax.swing.*;
import java.util.*;
public class greatest_between_3 {
    public static void main(String[] args) {
        System.out.println("enter 1st 2nd and 3rd no");
        Scanner obj = new Scanner(System.in);
        int a=obj.nextInt();
        int b=obj.nextInt();
        int c=obj.nextInt();
       if(a>b && a>c)
            System.out.println("a is greater "+ a);
       else if(b>c)
        {
            System.out.println("b is greater " + b);
        }
       else
        System.out.println(" c is greater "+ c);
    }
}
