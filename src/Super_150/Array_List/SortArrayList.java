package Super_150.Array_List;

import java.util.*;

public class SortArrayList {
    public static void main(String[] args) {
        ArrayList<Integer>list=new ArrayList<>();
        list.add(3);
        list.add(6);
        list.add(1);
        list.add(4);
        System.out.println(list);
        Collections.sort(list);//it will sort in ascending order
        System.out.println(list);
        Collections.sort(list,Collections.reverseOrder());//it will sort in decending order
        System.out.println(list);
    }
}
