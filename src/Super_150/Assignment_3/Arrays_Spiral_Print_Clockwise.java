package Super_150.Assignment_3;
import java.util.*;
public class Arrays_Spiral_Print_Clockwise {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        int c=sc.nextInt();
        int [][]arr=new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        printSpiral(arr);

    }
    public static void printSpiral(int [][]arr){
        int minr=0;
        int minc=0;
        int maxr=arr.length-1;
        int maxc=arr[0].length-1;
        int total_element=arr.length*arr[0].length;
        int count=0;
        while(count<total_element){
            for(int i=minc;i<=maxc && count<total_element;i++){
                System.out.print(arr[minr][i]+", ");
                count++;
            }
            minr++;
            for(int i=minr;i<=maxr && count<total_element;i++){
                System.out.print(arr[i][maxc]+", ");
                count++;
            }
            maxc--;
            for(int i=maxc; i>=minc && count<total_element;i--){
                System.out.print(arr[maxr][i]+", ");
                count++;
            }
            maxr--;
            for(int i=maxr; i>=minr && count<total_element;i--){
                System.out.print(arr[i][minc]+", ");
                count++;
            }
            minc++;

        }
        System.out.print("END");

    }
}
