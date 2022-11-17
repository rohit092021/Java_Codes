package Super_150.Two_D_Array;

public class Search_in_sorted_array {
    public static void main(String[] args) {
        int[][] arr={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        int key=16;
        Search(arr,key);
    }
    public static boolean Search(int[][] arr, int key){
        int row=0, col=arr[0].length-1;
        while(row<arr.length && col>=0){
            if(arr[row][col]==key){
                System.out.println(row+","+col);
                return true;
            }
            else if(key<arr[row][col]){
                col--;
            }
            else
                row++;
        }
        System.out.println("Key not found");
        return false;
    }
}
