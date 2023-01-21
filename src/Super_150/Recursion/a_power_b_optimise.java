package Super_150.Recursion;

public class a_power_b_optimise {
    public static void main(String[] args) {
        int a=2;
        int b=5;
        System.out.println(OptimisePower(a,b));
    }public static int OptimisePower(int a, int b){
        if(b==0){
            return 1;
        }
        int halfPower = OptimisePower(a,b/2)*OptimisePower(a,b/2);
         if(b%2==1){
             halfPower *=a;
         }
         return halfPower;
    }
}
