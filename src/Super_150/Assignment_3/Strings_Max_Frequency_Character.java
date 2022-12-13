package Super_150.Assignment_3;
import java.util.*;
public class Strings_Max_Frequency_Character {
    static final int ASCII_SIZE = 256;
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        System.out.println(getMaxOccurringChar(str));
        // Your Code Here
    }
    public static char getMaxOccurringChar(String str)
    {

        int count[] = new int[ASCII_SIZE];


        int len = str.length();
        for (int i = 0; i < len; i++)
            count[str.charAt(i)]++;

        int max = -1;
        char result = ' ';


        for (int i = 0; i < len; i++) {
            if (max < count[str.charAt(i)]) {
                max = count[str.charAt(i)];
                result = str.charAt(i);
            }
        }

        return result;
    }
}
