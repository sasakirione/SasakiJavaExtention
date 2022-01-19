package info.sasakirione.util.extentionj.collection;

import java.util.ArrayList;
import java.util.List;

public class Triple<T,U,V> implements Tuple {
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

    public static <T> List<T> getList(Triple<T, T, T> triple) {
        ArrayList<T> list = new ArrayList<>();
        list.add(triple.first());
        list.add(triple.second());
        list.add(triple.third());
        return list;
    }
}
