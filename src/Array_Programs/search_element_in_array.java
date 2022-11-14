package Array_Programs;
import java.util.*;
public class search_element_in_array {
    public static void main(String[] args) {
        int n,count=0;
        System.out.println("enter size");
        Scanner obj = new Scanner(System.in);
        int size = obj.nextInt();

        System.out.println("enter elements of array");
        int arr[] = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = obj.nextInt();
        }
        System.out.println("array elements are ");
        for (int i = 0; i < arr.length; i++)
        {
            System.out.println(arr[i]);
        }
        System.out.println("enter search element");
        n=obj.nextInt();
        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i]==n)
            {
                count++;
            }
        }
        if(count>0)
            System.out.println("element found");
        else
            System.out.println("not found");
    }
}
