package CodeChef.Contest_05_04_2023;
import java.util.*;
public class Melt_Gold {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int T=sc.nextInt();
        while(T-->0){
            int count=0;
            int n=sc.nextInt();
            int x=sc.nextInt();
            int z=n-x;
            for(int i=1;i<=n;i++){
                if(i*(i+1)>=2*z){
                    System.out.println(i);
                    break;
                }
            }
        }
    }
}
