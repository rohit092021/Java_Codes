package Super_150.LinkedList;

import java.util.LinkedList;

public class Linked_List_Client {
    public static void main(String[] args) throws Exception {
        Linked_List ll = new Linked_List();
        ll.AddFirst(1);
        ll.AddFirst(2);
        ll.AddFirst(3);
        ll.AddFirst(4);
        ll.Display();
        ll.AddLast(6);
        ll.Display();
        ll.AddIndex(90,4);
        ll.Display();
//        System.out.println(ll.GetFirst);
//        System.out.println();
//        System.out.println(getAtIndex(3));


    }
}
