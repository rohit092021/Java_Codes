package Super_150.Recursion;

import java.util.Scanner;

public class check_array_is_sorted {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int []arr=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
//        int i= sc.nextInt();
        System.out.println(isSorted(arr,0));
    }
    public static boolean isSorted(int [] arr, int i){
        if(i==arr.length-1){
            return true;
        }
        if(arr[i]>arr[i+1]){
            return false;
        }
        return isSorted(arr, i+1);
    }
}
