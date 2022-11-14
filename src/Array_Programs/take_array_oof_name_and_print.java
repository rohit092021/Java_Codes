//  Take an array of names as input from the user and print them on the screen.
package Array_Programs;
import java.util.*;
public class take_array_oof_name_and_print {
    public static void main(String[] args) {
        System.out.println("enter size of array");
        Scanner obj = new Scanner(System.in);
        int size = obj.nextInt();

        String arr[]=  new String[size];
        System.out.println("enter elements of array");
        for(int i=0;i<size;i++)
        {
            arr[i]=obj.next();
        }
        System.out.println("elements are : ");
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }
    }
}
