package Super_150.Two_D_Array;
import java.util.*;
public class input_2_D {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int [] [] arr=new int [n] [m];
        for(int i=0; i<arr.length; i++){
            for(int j=0;j<arr[0].length; j++){
                arr[i][j]=sc.nextInt();
            }
        }

    }

}
