package Super_150.Assignment_3;
import java.util.*;
public class Strings_Remove_Duplicates {
    public static void main(String args[]) {
        // Your Code Here
        Scanner sc = new Scanner (System.in);
        String s = sc.next();
        System.out.println(removeConsecutiveDuplicates(s));
    }
    public static String removeConsecutiveDuplicates(String input)
    {
        if (input.length() <= 1)
            return input;
        if (input.charAt(0) == input.charAt(1))
            return removeConsecutiveDuplicates(
                    input.substring(1));
        else
            return input.charAt(0)
                    + removeConsecutiveDuplicates(
                    input.substring(1));
    }
}
