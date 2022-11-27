package Super_150.Array_List;

import java.util.*;

public class Diagonal_Traverse {
    public static void main(String[] args) {

    }
    public int[] findDiagonalOrder(int[][] mat) {
    int n=mat.length;
    int m=mat[0].length;
    int ans[]=new int[n*m];
    int d=0;
    for(int i=0;i<n+m-1;i++){
        int row=0;
        int col =0;
        if(i<m){
            row=0;
            col=i;
        }
        else{
            row=i-m+1;
            col=m-1;
        }
        ArrayList<Integer>list= new ArrayList<>();
        while(row < n && col>=0){
            list.add(mat[row][col]);
            row++;
            col--;
        }
        if(i%2==0){
            Collections.reverse(list);
        }
        for(int val: list){
            ans[d]=val;
            d++;
        }
    }
    return ans;
    }
}
