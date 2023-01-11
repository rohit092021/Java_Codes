package Super_150.Recursion;

public class return_index_of_item {
    public static void main(String[] args) {
        int []arr={2,3,7,2,5,7,9,7};
        int item=7;
        System.out.println(returnIndex(arr , item ,0));
    }
    public static int returnIndex(int[] arr, int item,int i){
        if(i==arr.length){
            return -1; // if item is not present in arr
        }
        if(arr[i]==item){
           return i;
//            System.out.println(i);
        }
        return returnIndex(arr,item,i+1);
    }
}
