package ParkingLotAssignment;

import org.junit.Test;

public class ParkingLotTest {
    @Test
    public void should_add_observer_in_observer_list() {
        ParkingLot parkingLot = ParkingLot.create(12);
        parkingLot.addObserver(new DecoratedObserver(new Assistant(0.8)));
    }
}