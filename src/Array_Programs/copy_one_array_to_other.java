package Array_Programs;
import java.util.*;
public class copy_one_array_to_other {
    public static void main(String[] args) {
        System.out.println("enter size of 1st and 2nd array");
        Scanner obj = new Scanner(System.in);
        int size1,size2;
        size1 = obj.nextInt();
        size2 = obj.nextInt();

        int arr1[] = new int[size1];
        int arr2[] = new int[size1];
        System.out.println("enter elements of 1st array");
        for(int i=0;i<size1;i++)
        {
            arr1[i]=obj.nextInt();
        }

        System.out.println("first array elements are ");
        for(int i=0;i<arr1.length;i++)
        {
            System.out.println(arr1[i]);
        }
        System.out.println("second array elements are ");
        for(int i=0;i<arr1.length;i++)
        {
            arr2[i]=arr1[i];
            System.out.println(arr2[i]);
        }

    }
}
