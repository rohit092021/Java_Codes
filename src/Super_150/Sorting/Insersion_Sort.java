package Super_150.Sorting;

import java.util.Scanner;

public class Insersion_Sort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[]arr=new int[n];
        for(int i=0; i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
    InsersionSort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void InsersionSort(int[] arr){
        for(int i=0;i<arr.length;i++){
            int curr=arr[i];
            int prev=i-1;
            while(prev>=0 && arr[prev]>curr){
                arr[prev+1]=arr[prev];
                prev--;
            }
            arr[prev+1]=curr;
        }
    }
}
