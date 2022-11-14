package Array_Programs;
import java.util.*;
public class find_average_of_array_element {
    public static void main(String[] args) {
        int sum=0; double average;
        System.out.println("enter size");
        Scanner obj = new Scanner(System.in);
        int size = obj.nextInt();

        System.out.println("enter elements of array");
        int arr[] = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = obj.nextInt();
        }
        System.out.println("array elements are ");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
            sum+=arr[i];
        }
        average=sum/size;
        System.out.println("average is "+average);
    }
}
