package Super_150.Assignment_3;
import java.util.*;
public class Can_You_Read_This {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String s =  sc.next();
        char[] arr = new char[s.length()];
        for(int i = 0; i < arr.length; ++i){
            arr[i] = s.charAt(i);
        }

        for(int i =0;i<arr.length;i++){
            // int a = (int)

            if(arr[i]>=65 && arr[i]<=90){

                System.out.println();
                System.out.print(arr[i]);
            }
            else{
                System.out.print(arr[i]);
            }

        }

    }
}
