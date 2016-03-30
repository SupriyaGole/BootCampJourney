package parkingLot;

public interface ParkingLotObserver {
    public boolean isFilledBy(ParkingLot parkingLot,double threshold);
}
