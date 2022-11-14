package CLASSES_150.Arrays;

public class MaximumSubArray {
    public static void main(String[] args) {
        int [] arr={-2,-5,-6,-5,7};
        System.out.println(SubArray(arr));

    }
    public static int SubArray(int [] arr){
        int ans=Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            int sum=0;
            for(int j=i; j<arr.length;j++){
                sum+=arr[j];
                ans=Math.max(sum, ans);
            }
        }
        return ans;
    }
}
