package parkingLot;

public class ParkingLotFullException extends Throwable {
    public ParkingLotFullException() {
        super("Parking lot is full");
    }
}
