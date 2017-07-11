public class Main {

    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<String>();
        linkedList.show();
        //linkedList.deleteByValue(9);
        linkedList.add("a");
        linkedList.add("f");
        linkedList.add("r");
        linkedList.add("y");
        linkedList.show();
        System.out.println(linkedList.size());
        //linkedList.show();
        //linkedList.deleteByValue(9);
        //linkedList.deleteByValue(5);
        //linkedList.show();
        linkedList.add("p");
        linkedList.add("q");
        linkedList.show();
        System.out.println(linkedList.size());
        //linkedList.deleteByIndex(0);
        linkedList.show();
        linkedList.deleteByIndex(2);
        linkedList.show();
        System.out.println(linkedList.size());
        //linkedList.deleteByIndex(2);
        /*System.out.println("Hello World!");*/
    }
}

