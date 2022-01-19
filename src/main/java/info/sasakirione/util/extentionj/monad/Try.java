package info.sasakirione.util.extentionj.monad;

public interface Try<T> {
    T get();

    static <T> Try<T> valueOf(T value) {
        return new Success<>(value);
    }

    static Try valueOf(Exception exception) {
        return new Failure(exception);
    }
}
