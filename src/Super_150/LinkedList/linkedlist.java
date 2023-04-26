package Super_150.LinkedList;

public class linkedlist {
    public class Node{
        int data;
        Node next;

        public Node(int data){
            this.data=data;
            this.next=null;

        }


    }
    public static Node head;
    public static Node tail;
    public void addFirst(int data){
        //First Step - Create new node
        Node newNode = new Node(data);
        if(head==null){
            head=tail=newNode;
            return;
        }

        //Second Step
        newNode.next = head;

        //Third Step
        head = newNode;
    }
    public void addLast(int data){
        Node newNode = new Node(data);
        if(head==null){
            head=tail=newNode;
            return;
        }
        tail.next=newNode;
        tail=newNode;
    }

    public static void main(String[] args) {
        linkedlist ll = new linkedlist();
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addLast(3);
        ll.addLast(4);


    }

}
