package Super_150.Sliding_window;

import java.util.Scanner;

public class Sliding_window_demo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int []arr= {1,4,5,6,7,8,2,3,9,1,2,5};
        int k=sc.nextInt();

    }public static int MaximumSumm(int[]arr,int k) {
        int max = 0;
        int sum = 0;
        for (int i = 0; i< k; i++) {
            sum += arr[i];
        }
        max = sum;
        for (int i = k; i < arr.length; i++) {
            sum += arr[i];
            sum = sum = arr[i - k];
            max = Math.max(max, sum);
        }
        return max;
    }
}
