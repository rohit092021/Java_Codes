package CLASSES_150.Arrays;

import java.util.Scanner;

public class Max_SubArray_Sum_Brute_Force {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[]arr=new int[n];
        for(int i=0; i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        MaxSubArray(arr);
    }
    public static void MaxSubArray(int[] arr){
        int currsum=0;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            int start=i;
            for(int j=i;j<arr.length;j++){
                int end=j;
                currsum=0;
                for(int k=start;k<=end;k++){
//                       sum+=k;
                    currsum+=arr[k];
//                    System.out.print(arr[k]+" ");
                }
                System.out.println(currsum+" ");
                if(max<currsum){
                    max=currsum;
                }
            }
        }
        System.out.println("max sum = "+max);
//        System.out.println("Sum is "+sum);
    }
}
