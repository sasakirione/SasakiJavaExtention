package info.sasakirione.util.extentionj.monad;

import java.util.function.Function;

public interface Try<T> {
    T get();

    boolean isSuccess();

    static <T> Try<T> valueOf(T value) {
        return new Success<>(value);
    }

    static Try valueOf(Exception exception) {
        return new Failure(exception);
    }

    static <A, B> Try<B> of (Function<A, B> function, A inPara) {
        try {
            return new Success<>(function.apply(inPara));
        } catch (Exception ex) {
            return (Try<B>) new Failure(ex);
        }
    }
}
