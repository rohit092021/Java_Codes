package Super_150.Array_List;

import java.util.*;

public class find_maximum {
    public static void main(String[] args) {
        ArrayList<Integer> list= new ArrayList<>();
        int max=0;
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        Collections.sort(list);
        for(int i=0;i<list.size();i++){
            if(list.get(i)>max){
                max=list.get(i);
            }
        }
        System.out.println(max);
    }
}
