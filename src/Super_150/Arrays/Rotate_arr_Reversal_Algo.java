package Super_150.Arrays;

import java.util.Scanner;

public class Rotate_arr_Reversal_Algo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        Rotate(arr, k);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static void Rotate(int[] arr, int k) {

        int n = arr.length;
        k = k % n;
        while (k > 0) {
            int item = arr[n - 1];
            for (int i = n - 2; i >= 0; i--) {
                arr[i + 1] = arr[i];
            }
            arr[0] = item;
            k--;
        }

    }

    public static void ReversalAlgo(int[] arr, int k) {
        int n = arr.length;
        // last k element
        Reverse(arr, n - k, n - 1);
        // first k element n-k
        Reverse(arr, 0, n - k - 1);
        // hole array
        Reverse(arr, 0, n - 1);

    }

    public static void Reverse(int[] arr, int i, int j) {
        // TODO Auto-generated method stub

        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }

    }
}
