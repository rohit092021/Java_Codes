package CLASSES_150.Two_D_Array;

public class Spiral_Matrix {
    public static void main(String[] args) {
        int [] [] arr = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        printSpiral(arr);
    }
    public static void printSpiral(int [][]arr){
        int minr=0;
        int minc=0;
        int maxr=arr.length-1;
        int maxc=arr[0].length-1;
        int total_element=arr.length*arr[0].length;
        int count=0;
        while(count<total_element){
        for(int i=minc;i<=maxc && count<total_element;i++){
            System.out.print(arr[minr][i]+" ");
            count++;
        }
        minr++;
        for(int i=minr;i<=maxr && count<total_element;i++){
            System.out.print(arr[i][maxc]+" ");
            count++;
        }
        maxc--;
        for(int i=maxc; i>=minc && count<total_element;i--){
            System.out.print(arr[maxr][i]+" ");
            count++;
        }
        maxr--;
        for(int i=maxr; i>=minr && count<total_element;i--){
            System.out.print(arr[i][minc]+" ");
            count++;
        }
        minc++;

    }
}
}
