package test.sasakirione.util.extentionj.monad;

import info.sasakirione.util.extentionj.monad.Try;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class TryTest {
    @Test
    @DisplayName("初歩的なTryモナドの使用")
    public void test001() {
        class inner {
            static Try<Integer> resTry(String in) {
                Try<Integer> res;
                try {
                    int number = Integer.parseInt(in);
                    res = Try.valueOf(number);
                    return res;
                } catch (NumberFormatException e) {
                    res = Try.valueOf(e);
                    return res;
                }
            }
        }

        Assertions.assertEquals(10, inner.resTry("10").get());
        Assertions.assertInstanceOf(Throwable.class, inner.resTry("あ").get());
    }

}
