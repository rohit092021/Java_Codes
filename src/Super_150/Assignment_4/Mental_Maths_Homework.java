package Super_150.Assignment_4;
import java.util.*;
public class Mental_Maths_Homework {
    public static void main(String args[]) {
        Scanner obj = new Scanner(System.in);
        int N = obj.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; ++i) {
            arr[i] = obj.nextInt();
        }
        Arrays.sort(arr);
        int result = Math.max(arr[0] * arr[1] * arr[N - 1], arr[N - 1] * arr[N - 2] * arr[N - 3]);
        System.out.println(result);
    }
}
