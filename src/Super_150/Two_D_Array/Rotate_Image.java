package Super_150.Two_D_Array;

public class Rotate_Image {
    public static void main(String[] args) {
        int [][] arr= {{5,1,9,11},{2,4,8,10},{13,3,6,7},{15,14,12,16}};

    }
    public static void Transpose(int[][] arr){
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                int temp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }
        }
    }
    public static void RotateImage(int [][] arr){
        Transpose(arr);
        for(int i=0; i<arr.length; i++){
            ReverseArray(arr[i]);
        }
    }
    public static void ReverseArray(int[] arr){
        int temp=0;
        int j=arr.length-1;
        for(int i=0; i<arr.length; i++){

        }
    }
}
