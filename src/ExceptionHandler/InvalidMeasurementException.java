package ExceptionHandler;

public class InvalidMeasurementException extends Throwable {
    public InvalidMeasurementException(double value) {
        super("expected positive values but found measurement as "+ value);
    }
}
