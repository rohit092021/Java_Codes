package Super_150.Array_List;

import java.util.*;

public class swap {
    public static void main(String[] args) {
        ArrayList<Integer> list= new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        int idx1=1;
        int idx2=3;
        System.out.println(list);
        Swap(list,idx1,idx2);
        System.out.println(list);

    }
    public static void Swap(ArrayList<Integer>list,int idx1, int idx2){
        int temp= list.get(idx1);
        list.set(idx1,list.get(idx2));
        list.set(idx2,temp);
    }
}
