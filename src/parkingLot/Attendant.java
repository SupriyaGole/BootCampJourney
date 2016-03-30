package parkingLot;

import java.util.ArrayList;

public class Attendant implements ParkingLotObserver {
    private ArrayList<ParkingLot> parkingLots = new ArrayList<>();

    public void assign(ParkingLot parkingLot) {
        parkingLots.add(parkingLot);
    }

    public int totalParkingLots() {
        return parkingLots.size();
    }

    public boolean parkCarAt(ParkingLot parkingLot, Object car) throws ParkingLotFullException, NonAssignedParkingLotException {
        return isAssignedParkingLot(parkingLot) && parkingLot.park(car);
    }

    private boolean isAssignedParkingLot(ParkingLot parkingLot) throws NonAssignedParkingLotException {
        if (!parkingLots.contains(parkingLot))
            throw new NonAssignedParkingLotException();
        return true;
    }

    @Override
    public boolean isFilledBy(ParkingLot parkingLot, double threshold) {
        return false;
    }
}
