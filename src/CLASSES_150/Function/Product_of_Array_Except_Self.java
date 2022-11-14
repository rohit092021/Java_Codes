package CLASSES_150.Function;

public class Product_of_Array_Except_Self {
    public static void main(String[] args) {
        int[] arr ={1,2,3,4,5,6};
        System.out.println();
    }
    public static int[] array_Except_self(int  arr[]){
        int[] left = new int[arr.length];
        left[0]=1;
        for(int i=1;i<left.length;i++){
            left[i]=arr[i-1]*left[i-1];
        }

        int[] right = new int[arr.length];
        right[arr.length-1]=1;
        for(int i=right.length-2 ; i>=0; i--){
            right[i]=right[i+1]*arr[i+1];
        }
        return left;
    }
}
