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

    public boolean contains(T item){
        if (item == null){
            for (int i = 0; i < setCount; i++){
                if (collection[i] == null){
                    return true;
                }
            }
        }
        else {
            for (T anArr : collection){
                if (anArr == item){
                    return true;
                }
            }
        }
        return false;
    }
}
