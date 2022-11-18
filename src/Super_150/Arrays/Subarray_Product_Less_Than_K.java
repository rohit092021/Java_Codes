package Super_150.Arrays;

public class Subarray_Product_Less_Than_K {
    public static void main(String[] args) {
    int []arr={10,5,2,6};
    int k=100;
        System.out.print(SubarrayProduct(arr,k));
    }
    public static int SubarrayProduct(int[]arr,int k){
        int ans=0;
        int si=0;
        int ei=0;
        int p=1;
        while(ei<arr.length){
            //grow
            p*=arr[ei];
            //shrink
            while(p>=k && si<=ei){
                p/=arr[si];
                si++;
            }
            //ans calculation
            ans=ans+(ei-si+1);
            ei++;
        }
        return ans;
    }
}
