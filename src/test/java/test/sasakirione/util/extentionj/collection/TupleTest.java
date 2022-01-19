package test.sasakirione.util.extentionj.collection;

import info.sasakirione.util.extentionj.collection.Pair;
import info.sasakirione.util.extentionj.collection.Triple;
import info.sasakirione.util.extentionj.collection.Tuple;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class TupleTest {
    @Test
    @DisplayName("タプルまわり")
    public void test001() {
        Pair<String, Integer> tuple1 = Tuple.valueOf("おたく",123);
        Triple<String, Integer, Boolean> tuple2 = Tuple.valueOf("おたく", 123, true);
        Assertions.assertEquals(tuple1.second() ,123);
        Assertions.assertEquals(tuple2.third(), true);
    }
}
