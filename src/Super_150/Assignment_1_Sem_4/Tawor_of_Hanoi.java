package Super_150.Assignment_1_Sem_4;
import java.util.Scanner;
public class Tawor_of_Hanoi {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        TowerOfHanoi(n,"s","d","h");

    }
    public static void TowerOfHanoi(int n, String s, String d, String h){
        if(n<=0){
            return;
        }
        TowerOfHanoi(n-1,s,h,d);
        System.out.println("Moving ring " + n + " from " + s +" to "+ d);
        TowerOfHanoi(n-1,h,d,s);
    }
}
