package Super_150.Assignment_3;
import java.util.*;
public class Arrays_Sum_Of_Two_Arrays {
    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr1= new int[n];
        for(int i=0;i<n;i++){
            arr1[i]=sc.nextInt();
        }

        int m=sc.nextInt();
        int[]arr2 =new int[m];
        for(int j=0;j<m;j++){
            arr2[j]=sc.nextInt();
        }
        AddTwoArr(arr1,arr2);

    }
    public static void AddTwoArr(int[] arr1, int[] arr2) {
        int i = arr1.length - 1;
        int j = arr2.length - 1;
        ArrayList<Integer> list = new ArrayList<>();
        int carry = 0;
        while (i >= 0 && j >= 0) {
            int sum = 0;
            sum = arr1[i] + arr2[j] + carry;
            list.add(sum % 10);
            carry = sum / 10;
            i--;
            j--;
        }
        while (i >= 0) {
            int sum = 0;
            sum = arr1[i] + carry;
            list.add(sum % 10);
            carry = sum / 10;
            i--;
        }
        while (j >= 0) {
            int sum = 0;
            sum = arr2[j] + carry;
            list.add(sum % 10);
            carry = sum / 10;
            j--;
        }
        if (carry != 0) {
            list.add(carry);

        }
        for (int k = list.size() - 1; k >= 0; k--) {
            System.out.print(list.get(k) + ", ");
        }
        System.out.print("END");
    }
}
