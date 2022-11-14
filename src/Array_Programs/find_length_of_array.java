package Array_Programs;
import java.util.*;
public class find_length_of_array {
    public static void main(String[] args) {
        System.out.println("enter size");
        Scanner obj = new Scanner(System.in);
        int size = obj.nextInt();

        System.out.println("enter elements of array");
//        int count=0;
        int arr[]= new int[size];
        for(int i=0;i<size;i++)
        {
            arr[i]=obj.nextInt();
//            count++;
        }
        System.out.println("length is "+arr.length);

    }
}
