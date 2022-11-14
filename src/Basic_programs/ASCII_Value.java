package Basic_programs;
import java.util.*;
public class ASCII_Value {
    public static void main(String[] args)
    {
        System.out.println("enter charactor");
        Scanner obj = new Scanner(System.in);
        char a=obj.next().charAt(0);
        int b=a;
        System.out.println("Ascii is"+ b);
    }
}
