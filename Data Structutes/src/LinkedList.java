import sun.rmi.runtime.Log;

class LinkedList <T>{

    private Node head;
    private int listCount;

    LinkedList() {
        this.listCount = 0;
    }

    void add(T value){
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

    void show(){
        if (head == null){
            System.out.println("List is empty");
        }
        else {
            Node current = head;
            System.out.print("[");
            while (current.next != null){
                System.out.print(current.value);
                current = current.next;
                System.out.print(", ");
            }
            System.out.println(current.value + "]");
        }
    }

    void deleteByValue(T value){
        if (head == null){
            System.out.println("Cannot perform operation: list is empty");
        }

        else if (head.value == value){
            head = head.next;
        }
        else {
            Node current = head;
            while (current.next != null){
                if (current.next.value == value){
                    current.next = current.next.next;
                }
                current = current.next;
            }
        }
        listCount --;
    }

    void deleteByIndex(int index){
        if (head == null || index > listCount-1){
            System.out.println("Cannot perform operation: list is empty or wrong index value");
        }
        else if (index == 0) {
            head = head.next;
        }
        else {
            Node current = head;
            Node previousItem = head;
            int i = 0;
            while (i < index){
                i++;
                previousItem = current;
                current = current.next;
            }
            previousItem.next = current.next;
        }
        listCount --;
    }

    int size(){
        return listCount;
    }
}
