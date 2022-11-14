package JavaQuestions.Array_Question;
import java.util.*;
public class Binary_search {
    public static int BinarySearch(int num[], int key) {
        int start = 0;
        int end = num.length - 1;
        while (start <= end) {
            int mid = (end + start) / 2;
            if (num[mid] == key) {
                return mid;
            }
            if (num[mid] < key) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }

        }
        return -1;
    }

    public static void main(String[] args) {
        int num[] = {2, 3, 4, 5, 6, 7, 8};
        int key = 7;
        System.out.println("Index for key is "+BinarySearch(num,key)+" ");
    }
}