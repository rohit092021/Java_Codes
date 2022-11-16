package Super_150.Arrays;

public class array_demo {
    public static void main(String[] args) {
        int[] arr = new int[5];  //Java type decleration
        //int arr [] = new int[5];  // C type decleration
        System.out.println(arr);
        int [] other=arr;
        System.out.println(arr.length);
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr[3]);
        System.out.println(arr[4]);

        arr[0]=10;
        arr[1]=20;
        arr[2]=30;
        arr[3]=40;
        arr[4]=50;

        System.out.println(arr.length);
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr[3]);
        System.out.println(arr[4]);

    }
}
