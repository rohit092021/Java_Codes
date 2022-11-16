package Super_150.Arrays;

import java.util.Scanner;

public class return_tripletes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[]arr=new int[n];
        for(int i=0; i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
       ReturnTriplets(arr);
    }
    public static void ReturnTriplets(int[]arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length - 1; j++) {
                for (int k = j + 1; k < arr.length; k++) {
                    if (arr[i] + arr[j] + arr[k] == 0) {
                        System.out.println("[" + arr[i] + "," + arr[j]+"," + arr[k]+ "]");
                    }
                }
            }
        }
    }
}
