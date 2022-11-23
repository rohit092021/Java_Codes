package Super_150.Array_List;

import java.util.*;

public class Arraylist_userinput {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
    ArrayList<Integer>list=new ArrayList<>();
    for(int i=0;i<4;i++){
        list.add(sc.nextInt());
    }
    for(int i=0;i<list.size();i++){
        System.out.println(list.get(i));
    }
    }
}
