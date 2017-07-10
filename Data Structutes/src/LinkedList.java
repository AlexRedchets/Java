import sun.rmi.runtime.Log;

class LinkedList{

    private Node head;
    private int listCount;

    LinkedList() {
        this.listCount = 0;
    }

    void add(int value){
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

    void deleteByValue(int value){
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
            for (int i = 0; i != index; i++){
                current = current.next;
            }
            System.out.println(current.value);
            current = current.next;

            //current = current.next;
        }
    }
}
