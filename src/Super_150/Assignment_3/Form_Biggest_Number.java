package Super_150.Assignment_3;
import java.util.*;
public class Form_Biggest_Number {
    public static void main(String args[]) {

        Scanner obj = new Scanner(System.in);
        int T = obj.nextInt();
        for (int i = 0; i < T; ++i) {
            int size = obj.nextInt();
            int[] arr1 = new int[size];
            String[] arr = new String[size];
            for (int j = 0; j < size; ++j) {
                arr1[j] = obj.nextInt();
                arr[j] = Integer.toString(arr1[j]);
            }
            String st = LongestNumber(arr);
            System.out.println(st);
        }

    }

    public static String LongestNumber(String[] arr) {
        String ans = "";

        Arrays.sort(arr, (a, b) -> {

            String x = a + "" + b;

            String y = b + "" + a;

            return y.compareTo(x);

        });

        for (int i = 0; i < arr.length; i++) {

            ans += arr[i];

        }

        return ans;
    }
}
