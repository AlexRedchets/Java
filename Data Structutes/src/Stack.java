import java.lang.reflect.Array;

public class Stack<T> {

    private Node head;
    private int listCount;

    Stack() {;
        listCount = 0;
    }

    void push(T value){
        Node current = new Node(value);
        if (head == null){
            head = current;
        }
        else {
            current.next = head;
            head = current;
        }

        listCount ++;
    }

    Object pop(){
        if (head == null){
            System.out.println("Stack is empty");
        }
        else {
            Node current = head;
            head = head.next;
            listCount --;
            return current.value;
        }
        return 0;
    }

    Object peek(){
        if (head == null){
            System.out.println("Stack is empty");
        }
        else {
            Node current = head;
            while (current.next != null){
                current = current.next;
            }
            return current.value;
        }
        return 0;
    }

    int size(){
        return listCount;
    }

    void show(){
        if (listCount == 0){
            System.out.println("Stack is empty");
        }
        else {
            Node current = head;
            System.out.print("[");
            while (current.next != null){
                System.out.print(current.value + ", ");
                current = current.next;
            }
            System.out.print(current.value);
            System.out.print("]");
        }
    }
}
