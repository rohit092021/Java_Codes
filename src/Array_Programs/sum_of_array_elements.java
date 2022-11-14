package Array_Programs;
import java.util.Scanner;
public class sum_of_array_elements {
    public static void main(String[] args) {
        System.out.println("enter size");
        Scanner obj = new Scanner(System.in);
        int size = obj.nextInt();

        System.out.println("enter elements of array");
        int sum=0;
        int arr[] = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = obj.nextInt();
        }
        for(int i=0;i<arr.length;i++)
        {
            sum+=arr[i];
        }
        System.out.println("sum of array is "+sum);
    }
}
