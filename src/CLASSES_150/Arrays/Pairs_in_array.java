package CLASSES_150.Arrays;

import java.util.Scanner;

public class Pairs_in_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[]arr=new int[n];
        for(int i=0; i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        printPairs(arr);
    }
    public static void printPairs(int[] arr){
        for(int i=0;i<arr.length;i++){
            int curr=arr[i];
            for(int j=i+1;j<arr.length;j++){
                System.out.print("("+curr+","+arr[j]+")");
            }
            System.out.println();
        }
    }
}
