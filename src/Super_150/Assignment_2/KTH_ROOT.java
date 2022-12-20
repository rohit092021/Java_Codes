package Super_150.Assignment_2;
import java.util.*;
public class KTH_ROOT {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        long t=sc.nextInt();
        while(t-->0){
            long n=sc.nextLong();
            long k=sc.nextLong();
            System.out.println(kthroot(n,k));
        }
        // long n=67;
        // long k=3;
    }
    public static long kthroot(long n, long k){
        long lo=1;
        long hi=n;
        long ans=0;
        while(lo<=hi){
            long mid=lo+(hi-lo)/2;
            if(Math.pow(mid,k)<=n){
                ans=mid;
                lo=mid+1;
            }
            else{
                hi=mid-1;
            }
        }
        return ans;
        // Your Code Here
    }
}
