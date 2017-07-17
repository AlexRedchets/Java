public class Set<T> {

    private T collection[];
    private int setCount;

    public Set() {
        collection = null;
    }

    public Set(T[] collection) {
        this.collection = collection;
        setCount = collection.length;
    }

    public void add(T item){
        if (!contains(item)){
            if (setCount == collection.length){
                incrementArray();
            }
            collection[setCount++] = item;
        }
    }

    public boolean contains(T item){
        for (T anArr : collection){
            if (anArr == item){
                return true;
            }
        }
        return false;
    }


    public void incrementArray(){
        T[] tempArray = collection;
        int newSize = setCount + 5;
        collection = (T[]) new Object[newSize];
        System.arraycopy(tempArray, 0, collection, 0, setCount);
    }
}
