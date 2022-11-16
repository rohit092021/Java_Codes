package Super_150.Sorting;

import java.util.Scanner;

public class Counting_sort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[]arr=new int[n];
        for(int i=0; i<arr.length;i++) {
            arr[i] = sc.nextInt();
        }
        CountingSort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

    }
    public static void CountingSort(int[] arr){
        int larg=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            larg=Math.max(larg,arr[i]);
        }
        int []count=new int[larg+1];
        for(int i=0;i<arr.length;i++){
            count[arr[i]]++;

        }
        int j=0;
        for(int i=0;i<count.length;i++){
            while(count[i]>0){
                arr[j]=i;
                j++;
                count[i]--;
            }
        }
    }
}
