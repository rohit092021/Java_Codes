package Super_150.Recursion;

public class return_all_index_of_a_item {
    public static void main(String[] args) {
        int[] arr= {1,6,3,8,3,7,3,4,4,3};
        int item=3;
        System.out.println(Index(arr,0,item));

    }
    public static int Index(int[] arr, int  i,int item){
        if(i==arr.length){
            return -1;
        }
        if(arr[i]==item){
            System.out.println(i);
//            return i;
        }
        return Index(arr,i+1,item);
    }
}
