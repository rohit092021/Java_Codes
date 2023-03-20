package Super_150.BackTracking;
import java.util.*;
public class N_Queen {
    public static void main(String[] args) {
        int n=4;
        boolean[][] board = new boolean[n][n];
        N_queen(board,0,n);
    }
    public static void N_queen(boolean[][] board, int row, int tq){
        for(int col= 0; col < board.length; col++){
            if(isitasfe(board,row,col)==true){
                board[row][col]=true;
                N_queen(board,row+1,tq-1);
                board[row][col]=false;
            }
        }
    }
    public static boolean isitasfe(boolean[][]board,int row,int col){

        return false;
    }
    public static void Display(boolean[][]board){
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
    }
}
