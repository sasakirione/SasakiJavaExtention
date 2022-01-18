package info.sasakirione.util.extentionj.collection;

public class Pair<T, U> {
    private final T value1;
    private final U value2;

    public Pair(T value1, U value2) {
        this.value1 = value1;
        this.value2 = value2;
    }

    public T first() {
        return value1;
    }

    public U second() {
        return value2;
    }
}
