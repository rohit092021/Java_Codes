//  QUESTION:- Take an array as input from user.Search for a given no X and print the index at which it occurs
package Array_Programs;
import java.util.*;
public class Take_array_and_search_no_and_print_index {
    public static void main(String[] args) {
        System.out.println("enter the size of array");
        Scanner obj = new Scanner(System.in);
        int size = obj.nextInt();

        int arr[] = new int[size];
        System.out.println("enter elements of array");
        for(int i=0;i<size;i++)
        {
            arr[i]= obj.nextInt();
        }
        System.out.println("which elements index u want to find ?");
        int x = obj.nextInt();
        for(int i=0; i<arr.length;  i++)
        {
            if(arr[i]==x)
                System.out.println("X found at index "+i);

        }


    }
}
