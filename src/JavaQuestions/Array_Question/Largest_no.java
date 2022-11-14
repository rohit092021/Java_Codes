package JavaQuestions.Array_Question;
import java.util.*;
public class Largest_no
{
    public static int getLargest(int num[])
    {
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < num.length; i++)
        {
            if (largest < num[i])
            {
                largest = num[i];
            }
        }
        return largest;
    }

    public static void main(String[] args) {
        int num[]={2,3,4,5,6,7,8};
        System.out.println(getLargest(num));
    }
}
