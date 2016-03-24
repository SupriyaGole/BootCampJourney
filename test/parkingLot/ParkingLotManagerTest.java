package parkingLot;

import org.junit.Assert;
import org.junit.Test;

public class ParkingLotManagerTest {
    @Test
    public void should_know_number_of_parking_lot_he_has() throws InvalidParkingLotSizeException {
        ParkingLotManager parkingLotManager = new ParkingLotManager();
        ParkingLot parkingLotOfSize10 = ParkingLot.createParkingLot(10);
        ParkingLot parkingLotOfSize5 = ParkingLot.createParkingLot(5);
        parkingLotManager.assign(parkingLotOfSize5);
        parkingLotManager.assign(parkingLotOfSize10);
        Assert.assertEquals(2,parkingLotManager.totalParkingLots());
    }
}