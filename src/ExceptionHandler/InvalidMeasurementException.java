package ExceptionHandler;

public class InvalidMeasurementException extends Throwable {
    public InvalidMeasurementException(double feet, double inches) {
        super("expected positive values but found feet as "+feet + " and inches as "+inches);
    }
}
