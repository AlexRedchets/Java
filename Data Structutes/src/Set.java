public class Set<T> {

    Node head;
    int listCount;

    public Set() {
        listCount = 0;
    }

    public boolean has(T value){
        if (head == null){
            System.out.println("Set is empty");
        }
        else {
            Node current = head;
            while (current.next != null){
                if (current.value == value){
                    return true;
                }
                current = current.next;
            }
            return current.value == value;
        }
        return false;
    }

    public void add(T value){
        Node newNode = new Node(value);
        if (head == null){
            head = newNode;
        }
        else {
            Node current = head;
            while (current.next != null){
                if (current.value == value){
                    return;
                }
                current = current.next;
            }
            if (current.value == value){
                return;
            }
            current.next = newNode;
        }
        listCount ++;
    }

    public void show(){
        if (head == null){
            System.out.println("Set is empty");
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
    public int size(){
        return listCount;
    }
}
