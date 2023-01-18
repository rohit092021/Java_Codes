package Super_150.Recursion;

import java.util.Scanner;

public class Possible_grid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt(); // row
        int m =sc.nextInt(); // col
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                int [][]arr = new int[n][m];
            }
        }
        PrintAnswer(n,m,0,0,"");
//        System.out.println(PrintAnswer(n,m,0,0,));
    }
    public static void PrintAnswer(int n, int m, int cc, int cr, String ans){
        if(cc==m-1 && cr==n-1){
            System.out.println(ans);
            return;
        }
        if(cc>=m || cr>=n){
            return;
        }
        PrintAnswer(n,m,cc,cr+1,ans+"V");
        PrintAnswer(n,m,cc+1,cr,ans+"H");
    }
}
