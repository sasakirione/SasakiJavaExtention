package info.sasakirione.util.extentionj.collection;

public class Triple<T,U,V> {
    private final Pair<T, Pair<U, V>> value;

    public Triple(T value1, U value2, V value3) {
        Pair<U, V> pair = new Pair<>(value2, value3);
        this.value = new Pair<>(value1, pair);
    }

    public T first() {
        return value.first();
    }

    public U second() {
        return value.second().first();
    }

    public V third() {
        return value.second().second();
    }
}
