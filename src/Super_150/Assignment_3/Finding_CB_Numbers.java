package Super_150.Assignment_3;
import java.util.*;
public class Finding_CB_Numbers {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int z=sc.nextInt();
        String str=sc.next();
        // TODO Auto-generated method stub
        // String str = "692239";
        PrintSubString(str);

    }

    public static void PrintSubString(String str) {
        int count = 0;
        boolean[] visited = new boolean[str.length()];
        for (int len = 1; len <= str.length(); len++) {
            for (int j = len; j <= str.length(); j++) {
                int i = j - len;
                String s = str.substring(i, j);
                long num = Long.parseLong(s);
                if (isCbNumber(num) == true && isvisited(visited, i, j - 1) == true) {
                    count++;
                    // marked
                    for (int k = i; k <= j - 1; k++) {
                        visited[k] = true;
                    }

                }
            }

        }
        System.out.println(count);

    }

    public static boolean isvisited(boolean[] visited, int i, int j) {
        // TODO Auto-generated method stub
        for (int k = i; k <= j; k++) {
            if (visited[k] == true) {
                return false;
            }
        }
        return true;
    }

    public static boolean isCbNumber(long num) {
        if (num == 0 || num == 1) {
            return false;
        }
        int[] arr = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29};
        for (int i = 0; i < arr.length; i++) {
            if (num == arr[i]) {
                return true;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            if (num % arr[i] == 0) {
                return false;
            }
        }
        return true;

    }
}
