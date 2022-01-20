package test.sasakirione.util.extentionj.monad;

import info.sasakirione.util.extentionj.monad.Try;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class TryTest {
    @Test
    @DisplayName("初歩的なTryモナド")
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

    @Test
    @DisplayName("Tryモナドのちょっと実践的なやつ")
    public void test002() {
        class inner {
            static int resInt(String in) {
                return Integer.parseInt(in);
            }
        }

        List<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");
        list.add("おたく");
        list.add("3");

        int sum = list.stream().map(x -> Try.of((inner::resInt), x)).filter(Try::isSuccess).mapToInt(Try::get).sum();
        Assertions.assertEquals(6, sum);
    }

}
