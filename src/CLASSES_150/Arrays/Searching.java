package CLASSES_150.Arrays;
import java.util.Scanner;
public class Searching {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int item = sc.nextInt();
        System.out.println(FindIndex(arr, item));
    }
    public static int FindIndex(int []arr, int item){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==item){
                return i;
            }
        }
        return-1;
    }


}
