public class Main {

    public static void main(String[] args) {
        Set<Integer> set = new Set<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(5);
        set.show();
        System.out.println(set.size());
        set.add(5);
        set.add(1);
        set.add(5);
        set.add(3);
        set.add(5);
        set.show();
        System.out.println(set.size());
    }
}

