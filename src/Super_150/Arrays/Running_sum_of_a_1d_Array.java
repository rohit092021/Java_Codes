//package Super_150.Arrays;
//
//import java.util.Scanner;
//
//public class Running_sum_of_a_1d_Array {
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        int n=sc.nextInt();
//        int[] arr=new int[n];
//        for(int i=0;i<arr.length;i++){
//            arr[i]=sc.nextInt();
//        }
//
//        runningSum();
//
//    }
//    public static int runningSum(int[] arr) {
//        int[] arr1 = new int[arr.length];
//        arr1[0]=arr[0];
//        for(int i=1;i<arr.length;i++){
//            arr1[i]=arr1[i-1]+arr[i];
//        }
//
//    }
//}
