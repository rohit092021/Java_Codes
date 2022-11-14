package Array_Programs;
import java.util.*;
public class print_no {
    public static void main(String[] args) {
        System.out.println("enter no of elements");
        Scanner obj = new Scanner(System.in);
        int size =obj.nextInt();

        int arr[] = new int [size];
        System.out.println("Enter elements");
        for(int i=0;i<size;i++)
        {
            arr[i] = obj.nextInt();
        }
        System.out.println("elements are");
        for(int i=0;i<size;i++)
        {
            System.out.println(arr[i]);
        }
    }
}
