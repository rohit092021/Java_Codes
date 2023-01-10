package Super_150.Recursion;

public class inc_dec {
    public static void main(String[] args) {
        int n=5;
        incDec(n);
    }
    public static void incDec(int n){
        if(n==0){
            return;
        }
//        System.out.println(n);
        incDec(n-1);
        System.out.println(n);
        System.out.println(n);
    }
}
