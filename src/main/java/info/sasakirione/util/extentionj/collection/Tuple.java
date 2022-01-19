package info.sasakirione.util.extentionj.collection;

import java.util.List;

public interface Tuple {
    static<T, U> Pair<T, U> valueOf(T value1, U value2) {
        return new Pair<>(value1, value2);
    }

    static <T, U, V> Triple<T, U, V> valueOf(T value1, U value2, V value3) {
        return new Triple<>(value1,value2,value3);
    }
}
