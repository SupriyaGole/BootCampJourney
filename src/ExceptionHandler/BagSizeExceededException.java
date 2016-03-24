package ExceptionHandler;
public class BagSizeExceededException extends Throwable {
    public BagSizeExceededException() {
        super("Bag Size Exceeded. You can't add more");
    }
}
