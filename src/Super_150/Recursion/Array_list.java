package Super_150.Recursion;
import java.util.*;
public class Array_list {
    public static void main(String[] args) {
        ArrayList<Integer>list=new ArrayList<>();
        System.out.println(list.size());
        System.out.println(list);
        list.add(10);
        list.add(12);
        System.out.println(list);
        list.add(1,20);// range of index is 0 to size for add
        System.out.println(list);
        list.remove(3); // range of index is 0 to size-1 for remove
        System.out.println(list);
        list.add(2);
        list.add(3);
        //get
        System.out.println(list.get(2));
        System.out.println(list);
        list.set(3,-90);// it update the value
        System.out.println(list);
    }
}
