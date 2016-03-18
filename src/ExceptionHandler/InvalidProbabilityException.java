package ExceptionHandler;

public class InvalidProbabilityException extends Throwable {
    public InvalidProbabilityException(double value) {
        super("Expected chance to lie between 0 to 1 but found "+value);
    }
}
