package parkingLot;

public class InvalidParkingLotSizeException extends Throwable {
    public InvalidParkingLotSizeException(int size) {
        super("Expected parking lot size as a positive integer but found "+ size);
    }
}
