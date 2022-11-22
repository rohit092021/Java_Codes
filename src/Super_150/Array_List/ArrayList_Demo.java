package Super_150.Array_List;

import java.util.ArrayList;

public class ArrayList_Demo {
    public static void main(String[] args) {
        ArrayList<Integer>List=new ArrayList<>();
        System.out.println(List);
        List.add(10);// it the element in the last
        List.add(20);

        System.out.println(List);
        System.out.println(List.get(0));//find element its range is 0 to n-1
        List.add(2,30);// add at index
        System.out.println(List);
//        System.out.println(List.size());// find length of array

        //remove
        //renge 0 to n-1
        List.remove(1);
        System.out.println(List);

        //Update index
        List.set(0,20);
        System.out.println(List);
        List.add(30);
        List.add(40);

        for(int i=0;i<List.size();i++){
            System.out.println(List.get(i));
        }
        System.out.println();
        for(int val:List) //for each loop
        {
            System.out.print(val+" ");
        }
    }
}
