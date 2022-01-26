package info.sasakirione.util.extentionj.monad;

public interface Either<A, B> {
    static <A, B> Either<A, B> right(B b) {
        return new Right<>(b);
    }

    static <A, B> Either<A, B> left(A a) {
        return new Left<>(a);
    }

    boolean isLeft();
    boolean isRight();
}
