public class Main {

    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        System.out.println(stack.pop());
        stack.push("d");
        stack.push("g");
        stack.push("r");
        stack.push("b");
        stack.show();
        System.out.println(stack.pop());
        stack.show();
        System.out.println(stack.peek());
        stack.show();
        System.out.println(stack.size());
    }
}

