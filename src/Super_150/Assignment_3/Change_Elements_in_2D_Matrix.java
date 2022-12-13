package Super_150.Assignment_3;
import java.util.*;
public class Change_Elements_in_2D_Matrix {
    public static void main (String args[]) {
        Scanner obj = new Scanner(System.in);
        int row = obj.nextInt();
        int col = obj.nextInt();
        int[][] arr = new int[row][col];
        ArrayList<Integer> list1 = new ArrayList<Integer>(5);
        ArrayList<Integer> list2 = new ArrayList<Integer>(5);
        for (int i = 0; i < row; ++i) {
            for (int j = 0; j < col; ++j) {
                arr[i][j] = obj.nextInt();
                if (arr[i][j] == 0) {
                    list1.add(i);
                    list2.add(j);
                }

            }
        }
        for (int i = 0; i < row; ++i) {
            for (int j = 0; j < col; ++j) {
                if (list1.contains(i) || list2.contains(j)) {
                    arr[i][j] = 0;
                }
            }
        }
        for (int i = 0; i < row; ++i) {
            for (int j = 0; j < col; ++j) {
                System.out.print(arr[i][j] + " ");


            }
            System.out.println();
        }

    }
}
