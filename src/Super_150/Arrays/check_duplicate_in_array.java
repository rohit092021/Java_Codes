package Super_150.Arrays;

import java.util.Scanner;

public class check_duplicate_in_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[]arr=new int[n];
        for(int i=0; i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(CheckDuplicate(arr));
    }
    public static boolean CheckDuplicate(int[]arr){
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length-1;j++) {
                if (arr[i] == arr[j]) {
                    return true;
                }
            }
        }
        return false;
    }
}
