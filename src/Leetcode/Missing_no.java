package Leetcode;

public class Missing_no {
    public static void main(String[] args) {
        int[] arr={3,0,1};
        System.out.println(Missing(arr));
    }
    public static int Missing(int[] arr){
        int ans=0,i;
        for( i=0;i<arr.length;i++){
            ans=ans+(i-arr[i]);
        }
        return ans+i;
    }
}
