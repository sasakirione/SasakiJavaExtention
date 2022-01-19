package info.sasakirione.util.extentionj.monad;

public class Failure implements Try<Throwable>{
    private final Throwable exception;

    public Failure(Throwable exception) {
        this.exception = exception;
    }

     public Throwable get() {
        return exception;
     }
}
