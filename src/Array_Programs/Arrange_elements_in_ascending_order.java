package Array_Programs;
import java.util.*;
public class Arrange_elements_in_ascending_order {
    public static void main(String[] args) {
        int n, count = 0;
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
        }
        Arrays.sort(arr);
        System.out.println("Sorted elements are");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}