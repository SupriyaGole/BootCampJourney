package ExceptionHandler;
public class InvalidSizeException extends Throwable {
    public InvalidSizeException(int size) {
        super("expected bag size between 0 to 12 but found "+size);
    }
}
