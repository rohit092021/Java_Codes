package Super_150.BackTracking;

public class Queen_Permutation {
    public static void main(String[] args) {
        int n=4;
        int tq=2;
        boolean [] board = new boolean[4];
        Permutation(board, tq, 0,"");
    }

    public static void Permutation( boolean [] board, int tq, int qpsf, String ans) {
        if(qpsf==tq){
            System.out.println(ans);
            return;
        }
        for(int i =0; i< board.length; i++){
            if(board[i]==false){
                board[i]=true;
//                qpsf+=1;
                Permutation(board, tq, qpsf+1, ans+"b"+i+"q"+qpsf);
                board[i]=false;
            }
        }
    }
}
//443 454   FJCPR8834R    1208870117032970