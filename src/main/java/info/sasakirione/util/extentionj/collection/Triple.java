package info.sasakirione.util.extentionj.collection;

import java.util.ArrayList;
import java.util.List;

/**
 * 要素3のタプル
 * @param <T> 1つめの要素の型
 * @param <U> 2つめの要素の型
 * @param <V> 3つめの要素の型
 */
public class Triple<T,U,V> implements Tuple {
    private final T value1;
    private final U value2;
    private final V value3;

    /**
     * 要素数3のタプルのコンストラクタ
     * @param value1 1つめの要素
     * @param value2 2つめの要素
     * @param value3 3つめの要素
     */
    public Triple(T value1, U value2, V value3) {
        this.value1 = value1;
        this.value2 = value2;
        this.value3 = value3;
    }

    /**
     * 1つめの要素を取り出す
     * @return 1つめの要素
     */
    public T first() {
        return value1;
    }

    /**
     * 2つめの要素を取り出す
     * @return 2つめの要素
     */
    public U second() {
        return value2;
    }

    /**
     * 3つめの要素を取り出す
     * @return 3つめの要素
     */
    public V third() {
        return value3;
    }

    /**
     * リストにする
     * @param triple 要素3のタプル
     * @param <T> 型(リスト化するには全ての要素が同じ型な必要があります)
     * @return リスト
     */
    public static <T> List<T> getList(Triple<T, T, T> triple) {
        ArrayList<T> list = new ArrayList<>();
        list.add(triple.first());
        list.add(triple.second());
        list.add(triple.third());
        return list;
    }
}
