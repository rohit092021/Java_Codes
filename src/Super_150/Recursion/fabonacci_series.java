package Super_150.Recursion;

public class fabonacci_series {
    public static void main(String[] args) {
//        int a=0;
//        int b=1;
        int n=10;
        System.out.println(febo(n));
    }
    public static int febo(int n){
        if(n== 0 || n==1){
            return n;
        }
        int f1=febo(n-1);
        int f2=febo(n-2);
        return f1+f2;
    }
}
