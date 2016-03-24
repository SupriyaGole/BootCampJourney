package parkingLot;

import java.util.ArrayList;

public class ParkingLotManager{
    private ArrayList<ParkingLot> parkingLots= new ArrayList<>();

    public void assign(ParkingLot parkingLot) {
        parkingLots.add(parkingLot);
    }

    public int totalParkingLots() {
        return parkingLots.size();
    }
}
