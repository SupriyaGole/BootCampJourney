package parkingLot;

public class NonAssignedParkingLotException extends Throwable {
    public NonAssignedParkingLotException() {
        super("Provided parking lot is not assigned to the manager");
    }
}
