package JavaQuestions.Array_Question;
import java.util.*;
public class LinearSearch {
    public static int LinearSearch(int numbers[],int key)
    {
        for(int i=0;i<numbers.length;i++)
        {
            if(numbers[i]==key)
            {
                return key;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int numbers[]={2,4,6,8,10,12,14};
        int key=10;
//        System.out.println(LinearSearch(numbers,key));
        int index = LinearSearch(numbers,key);
        if(index==-1)
        {
            System.out.println("Not found");
        }
        else
        {
            System.out.println(index);
        }

    }
}
