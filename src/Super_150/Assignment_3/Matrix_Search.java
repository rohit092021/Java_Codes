package Super_150.Assignment_3;
import java.util.*;
public class Matrix_Search {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int M=sc.nextInt();
        int [][] arr=new int[N][M];
        for(int i=0;i<N;i++){
            for(int j=0;j<M;j++){
                arr[i][j]=sc.nextInt();
            }
        }

        // int[][] arr = { { 1, 4, 7, 11, 15 }, { 2, 5, 8, 12, 19 }, { 3, 6, 9, 16, 22 }, { 10, 13, 14, 17, 24 },
        // 		{ 18, 21, 23, 26, 30 } };
        int x = sc.nextInt();
        System.out.println(Search(arr, x));

    }

    public static int Search(int[][] arr, int x) {
        int row = 0;
        int col = arr[0].length - 1;
        while (row < arr.length && col >= 0) {

            if (arr[row][col] == x) {
                return 1;
            } else if (arr[row][col] > x) {
                col--;
            } else {
                row++;
            }

        }
        return 0;
    }
    }
