package test.sasakirione.util.extentionj.monad;

import info.sasakirione.util.extentionj.monad.Either;
import info.sasakirione.util.extentionj.monad.Left;
import info.sasakirione.util.extentionj.monad.Right;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class EitherTest {
    @Test
    @DisplayName("基本的なEither")
    public void test001() {
        Either<String, Integer> either = Either.right(330);
        Either<String, Integer> either2 = Either.left("Error");

        if (either instanceof Right<String, Integer>) {
            Assertions.assertTrue(true);
        } else {
            Assertions.fail();
        }

        if (either2 instanceof Left<String, Integer>) {
           Assertions.assertTrue(true);
        } else {
            Assertions.fail();
        }
    }
}
