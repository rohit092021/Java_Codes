package Super_150.Sliding_window;
import java.util.Scanner;

public class Kartik_Bhaiya_And_Strings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k=sc.nextInt();
        String s=sc.next();

        int aflip=Max_length(s,k,'a');
        int bflip=Max_length(s,k,'b');
        System.out.println(Math.max(aflip,bflip));
    }
    public static int Max_length(String s, int k,char ch){
        int si=0;
        int ei=0;
        int flip=0;
        int ans=0;
        while(ei<s.length()){
            if(s.charAt(ei)==ch){
                flip++;
            }
            while(flip>k){
                if(s.charAt(si)==ch){
                    flip--;
                }
                si++;
            }
            ans=Math.max(ans,ei-si+1);
            ei++;
        }
        return ans;
    }
}