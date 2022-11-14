package CLASSES_150.Sorting;

public class Bubble_Sort {
    public static void main(String[] args) {
        int[] arr = {3, 5, 4, 2, 1};
        Sort(arr);
        for (int i = 0; i < arr.length ; i++) {
            System.out.println(arr[i]+ " ");
        }

    }

    public static void Sort(int[] arr) {
        for (int j = 0; j < arr.length; j++) {
            for (int i = 0; i < arr.length ; i++) {
                if (arr[i] > arr[i]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
        }
    }
}
