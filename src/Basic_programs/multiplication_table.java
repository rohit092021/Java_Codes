package Basic_programs;
import java.util.*;
public class multiplication_table {
    public static void main(String[] args) {
        System.out.println("which table u want to print");
        Scanner obj = new Scanner(System.in);
        int a=obj.nextInt();
        for(int i=1;i<=10;i++)
        {
            System.out.println(a+"*"+i +"="+a*i);
        }
    }
}
