package Super_150.Sorting;

import java.util.Scanner;

public class Bubble_Sort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[]arr=new int[n];
        for(int i=0; i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        Sort(arr);
        for (int i = 0; i < arr.length ; i++) {
            System.out.print(arr[i]+ " ");
        }

    }

    public static void Sort(int[] arr) {
        for (int j = 0; j < arr.length; j++) {
//            int swap=0;
            for (int i = 0; i < arr.length-1-j ; i++) {
                if (arr[i] > arr[i+1]) {
//                    swap++;
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
//            System.out.print("SWAP IS "+swap+" ");
        }

    }
}
