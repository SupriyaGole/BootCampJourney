package ParkingLotAssignment;

public class ParkingLot {
    private int size;

    public ParkingLot(int size) {

        this.size = size;
    }

    public static ParkingLot create(int size) {
        return new ParkingLot(size);
    }

    public void addObserver(DecoratedObserver decoratedObserver) {

    }
}
