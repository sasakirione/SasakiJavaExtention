package info.sasakirione.util.extentionj.collection;

import java.util.ArrayList;
import java.util.List;

/**
 * 要素数2のタプル
 * @param <T> 1つめの要素の型
 * @param <U> 2つめの要素の型
 */
public class Pair<T, U> implements Tuple {
    private final T value1;
    private final U value2;

    /**
     * 要素数2のタプルの基本的なコンストラクタ
     * @param value1 1つめの要素
     * @param value2 2つめの要素
     */
    public Pair(T value1, U value2) {
        this.value1 = value1;
        this.value2 = value2;
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
     * リストにする
     * @param pair 要素2のタプル
     * @param <T> 型(リスト化するには1つめの要素と2つめの要素が同じ型な必要があります)
     * @return リスト
     */
    public static <T> List<T> getList(Pair<T, T> pair) {
        ArrayList<T> list = new ArrayList<>();
        list.add(pair.first());
        list.add(pair.second());
        return list;
    }
}
