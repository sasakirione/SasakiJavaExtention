package info.sasakirione.util.extentionj.monad;

public class Right<A, B> implements Either<A, B>{
    private final B value;

    public Right(B b) {
        value = b;
    }

    public B get() {
        return value;
    }

    @Override
    public boolean isLeft() {
        return false;
    }

    @Override
    public boolean isRight() {
        return true;
    }
}
