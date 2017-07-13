public class Main {

    public static void main(String[] args) {
        Queue<String> queue = new Queue<>();
        queue.show();
        queue.enqueue("d");
        queue.enqueue("g");
        queue.enqueue("h");
        queue.enqueue("g");
        queue.enqueue("j");
        queue.enqueue("p");
        queue.show();
        System.out.println(queue.dequeue());
        queue.show();
        System.out.println(queue.dequeue());
        queue.show();
    }
}

