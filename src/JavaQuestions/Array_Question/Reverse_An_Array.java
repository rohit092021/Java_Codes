package JavaQuestions.Array_Question;
import java.util.*;
public class Reverse_An_Array {
    public static void reverseArray(int num[]) {
        int first = 0, last = num.length - 1;
        while (first < last) {
            int temp = num[last];
            num[last] = num[first];
            num[first] = temp;
            first++;
            last--;
        }
    }

    public static void main(String[] args) {
        int num[]={1,2 ,3 ,4 ,5 ,6 };
        reverseArray(num);
        for(int i=0;i<num.length;i++){
            System.out.print(num[i]);
        }
        System.out.println();
    }
}
