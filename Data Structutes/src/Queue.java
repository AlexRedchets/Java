public class Queue<T> {

    Node head;
    int listCount;

    public Queue() {
        listCount = 0;
    }

    public void enqueue(T value){
        Node newNode = new Node(value);
        if (head == null){
            listCount ++;
            head = newNode;
        }
        else {
            Node current = head;
            while (current.next != null){
                current = current.next;
            }
            current.next = newNode;
            listCount ++;
        }
    }

    public Object dequeue(){
        if (head == null){
            System.out.println("Queue is empty");
            return null;
        }
        else{
            Object current = head.value;
            head = head.next;
            listCount --;
            return current;
        }
    }

    public int size(){
        return listCount;
    }

    public void show(){
        if (head == null){
            System.out.println("Queue is empty");
        }
        else {
            Node current = head;
            System.out.print("[");
            while (current.next != null){
                System.out.print(current.value + ", ");
                current = current.next;
            }
            System.out.print(current.value + "]");
        }
    }
}
