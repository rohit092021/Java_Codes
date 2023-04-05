package Super_150.LinkedList;
import java.security.PublicKey;

//import static jdk.vm.ci.code.CodeUtil.K;

public class Linked_List {
    public class Node {
        int val;
        Node next;
    }
    private Node head;
    private int size;
    private Node tail;
    public void AddFirst(int item) {
        Node nn = new Node();
        nn.val = item;
        if (size == 0) {
            this.head = nn;
            this.tail = nn;
            this.size++;
        } else {
            nn.next = head;
            head = nn;
            this.size++;
        }
    }
    public void Display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val + "->");
            temp = temp.next;
        }
        System.out.println(".");
    }

    public void AddLast(int item) {
        if (size == 0) {
            AddFirst(item);
        } else {
            Node nn = new Node();
            nn.val = item;
            tail.next = nn;
            tail = nn;
            size++;
        }
    }
    public Node GetNode(int k) throws Exception {
        if (k < 0 || k >= size) {
            throw new Exception("Bklol k range me nhi h");
        }
        Node temp = head;
        for (int i = 1; i <= k; i++) {
            temp = temp.next;
        }
        return temp;
    }
    public void AddIndex(int item, int k) throws Exception {
        if (k < 0 || k > size) {
            throw new Exception("K is not in range");
        }
        if (k == 0) {
            AddFirst(item);
        } else if (k == size) {
            AddLast(item);
        } else {
            Node nn = new Node();
            nn.val = item;
            Node K_th = GetNode(k - 1);
            Node Kth = K_th.next;
            K_th.next = nn;
            nn.next = Kth;
            size++;
        }
    }
    public int GetFirst() {
        return head.val;
    }
    public int GetLast() {
        return tail.val;
    }
    public int get_At_any_index(int k) throws Exception {
        return GetNode(k).val;
    }
    public int removeFirst() throws Exception {
        if (size == 0) {
            throw new Exception("Linklist is Empty");
        }
        int rv = head.val;
        if (size == 1) {
            head = null;
            tail = null;
            size--;
        } else {
            Node temp = head;
            head = head.next;
            temp.next = null;
            size--;
        }
        return rv;
    }
    public int removeLast() throws Exception {
        if (size == 0) {
            throw new Exception("Linklist is Empty");
        }
        int rv = head.val;
        if (size == 1) {
            return removeFirst();

        } else {
            int v=tail.val;
            Node n=GetNode(size-2);
            tail=n;
            tail.next=null;
            size--;
            return v;
        }
    }
    public int remove_at_index(int k) throws Exception {
        if (size == 0) {
            throw new Exception("Linklist is Empty");
        }

        if (k==0) {
            return removeFirst();

        } else if(k==size-1) {
            return removeLast();

        }
        else{
            Node k_th=GetNode(k-1);
            Node Kth = k_th.next;
            k_th.next=null;
            size--;
            return Kth.val;
        }
    }

}