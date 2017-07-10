import sun.rmi.runtime.Log;

public class LinkedList{

    private Node head;
    private int listCount;

    public LinkedList() {
        this.listCount = 0;
    }

    public void add(int value){
        Node end = new Node(value);
        if (head == null){
            head = end;
            listCount++;
        }
        else {
            Node current = head;
            while (current.next != null){
                current = current.next;
            }
            current.next = end;
            listCount ++;
        }
    }

    public void show(){
        Node current = head;
        if (current == null){
            System.out.println("List is empty");
        }
        else {
            System.out.print("[");
            while (current.next != null){
                System.out.print(current.value);
                current = current.next;
                System.out.print(", ");
            }
            System.out.println(current.value + "]");
        }
    }

    public class Node {
        int value;
        Node next;

        public Node(int value) {
            this.value = value;
            this.next = null;
        }
    }
}
