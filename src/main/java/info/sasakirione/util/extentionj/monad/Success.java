package info.sasakirione.util.extentionj.monad;

public final class Success<T> implements Try<T>{
    private final T value;

    public Success(T value) {
        this.value = value;
    }

    public T get() {
        return value;
    }

    @Override
    public boolean isSuccess() {
        return true;
    }
}
