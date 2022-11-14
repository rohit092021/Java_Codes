package CLASSES_150.Function;
import java.util.*;
public class Is_Armsstrong {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(IsArmstrongNo(n));

    }

    public static boolean IsArmstrongNo(int n){
        int d=countDigit(n);
        int ans=0;
        int temp=n;
        while(n>0){
        int rem=n%10;
        ans=(int) (ans+Math.pow(rem,d));
        n/=10;
        }
        if(ans == temp){
            return true;
        }
        else {
            return false;
        }
    }
    public static int countDigit(int n)
    {
        int c=0;
        while(n>0)
        {
            n/=10;
            c++;
        }
        return c;
    }
}
