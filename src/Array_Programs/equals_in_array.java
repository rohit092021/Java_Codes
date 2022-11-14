package Array_Programs;
import javax.swing.*;
import java.util.*;
public class equals_in_array {
    public static void main(String[] args) {
        int a[]={1,2,3,4,5};
        int b[]={1,2,3,4,5};

        if(Arrays.equals(a,b))
        {
            System.out.println("both are equal");
        }
        else
        System.out.println("not equal");
    }
}
