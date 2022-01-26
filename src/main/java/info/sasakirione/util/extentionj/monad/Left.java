package info.sasakirione.util.extentionj.monad;

public class Left<A, B> implements Either<A, B>{
    private final A value;

    public Left(A a) {
        value = a;
    }

    public A get() {
        return value;
    }

    @Override
    public boolean isLeft() {
        return true;
    }

    @Override
    public boolean isRight() {
        return false;
    }
}
