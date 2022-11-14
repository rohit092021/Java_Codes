package Basic_programs;
import java.util.*;
public class switch_que {
    public static void main(String[] args) {
        System.out.println("enter no");
        Scanner obj = new Scanner(System.in);
        int key = obj.nextInt();
        switch(key)
        {
            case 1 :
                System.out.println("Rohit");
                break;
            case 2:
                System.out.println("sunil");
                break;
            case 3:
                System.out.println("Shiv");
                break;
            default :
                System.out.println("Invalid Syntax");
        }
    }
}
