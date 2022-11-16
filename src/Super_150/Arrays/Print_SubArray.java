package Super_150.Arrays;

import java.util.Scanner;

public class Print_SubArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[]arr=new int[n];
        for(int i=0; i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        SubArray(arr);
    }
    public static void SubArray(int[] arr){
        int ts=0;
//        int sum=0;
        for(int i=0;i<arr.length;i++){
           int start=i;
               for(int j=i;j<arr.length;j++){
                   int end=j;
                   for(int k=start;k<=end;k++){
//                       sum+=k;
                       System.out.print(arr[k]+" ");
                   }
                   ts++;
                   System.out.println();
               }
                System.out.println();
            }
            System.out.println("Total Subarray = "+ts);
//        System.out.println("Sum is "+sum);
        }
    }

