package info.sasakirione.util.extentionj.monad;

public sealed interface Either<A, B> permits Left, Right {

    static <A, B> Either<A, B> right(B b) {
        return new Right<>(b);
    }

    static <A, B> Either<A, B> left(A a) {
        return new Left<>(a);
    }

    boolean isLeft();
    boolean isRight();
}
