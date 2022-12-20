package Super_150;
import java.util.*;
public class nobita {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=1;i<=t;i++){
            int a=sc.nextInt();
            int b=sc.nextInt();
            int k=a%b;
//            int j=b-k;
            System.out.println(k);
        }
    }
}
