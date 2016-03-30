package parkingLot;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class AttendantTest {

    @Rule
    public ExpectedException thrown = ExpectedException.none();
    @Test
    public void should_know_number_of_parking_lot_he_has() throws InvalidParkingLotSizeException {
        Attendant attendant = new Attendant();
        ParkingLot parkingLotOfSize10 = ParkingLot.createParkingLot(10);
        ParkingLot parkingLotOfSize5 = ParkingLot.createParkingLot(5);
        attendant.assign(parkingLotOfSize5);
        attendant.assign(parkingLotOfSize10);
        assertEquals(2, attendant.totalParkingLots());
    }

    @Test
    public void should_park_a_car_in_specified_parking_lot() throws InvalidParkingLotSizeException, NonAssignedParkingLotException, ParkingLotFullException {
        Attendant attendant = new Attendant();
        ParkingLot parkingLotOfSize10 = ParkingLot.createParkingLot(10);
        ParkingLot parkingLotOfSize5 = ParkingLot.createParkingLot(5);
        attendant.assign(parkingLotOfSize5);
        attendant.assign(parkingLotOfSize10);
        boolean result = attendant.parkCarAt(parkingLotOfSize5, new Object());
        assertTrue(result);
    }

    @Test
    public void should_throw_an_exception_when_parking_lot_is_not_assigned_to_the_manager() throws InvalidParkingLotSizeException, NonAssignedParkingLotException, ParkingLotFullException {
        thrown.expect(NonAssignedParkingLotException.class);
        thrown.expectMessage("Provided parking lot is not assigned to the manager");
        Attendant attendant = new Attendant();
        ParkingLot parkingLotOfSize10 = ParkingLot.createParkingLot(10);
        ParkingLot parkingLotOfSize5 = ParkingLot.createParkingLot(5);
        attendant.assign(parkingLotOfSize10);
        attendant.parkCarAt(parkingLotOfSize5,new Object());
    }

    @Test
    public void should_give_updates_according_to_parking_lots() throws InvalidParkingLotSizeException, NonAssignedParkingLotException, ParkingLotFullException {
        Attendant attendant = new Attendant();
        ParkingLot parkingLotOfSize10 = ParkingLot.createParkingLot(10);
        ParkingLot parkingLotOfSize5 = ParkingLot.createParkingLot(5);
        attendant.assign(parkingLotOfSize5);
        attendant.assign(parkingLotOfSize10);
        attendant.parkCarAt(parkingLotOfSize5,new Object());
        attendant.parkCarAt(parkingLotOfSize5,new Object());
        attendant.parkCarAt(parkingLotOfSize10,new Object());
    }

    @Test
    public void should_give_true_when_parking_lot_is_available_to_promote() throws InvalidParkingLotSizeException, NonAssignedParkingLotException, ParkingLotFullException {
        Attendant attendant = new Attendant();
        ParkingLot parkingLotOfSize10 = ParkingLot.createParkingLot(10);
        attendant.assign(parkingLotOfSize10);
        attendant.parkCarAt(parkingLotOfSize10,new Object());
        boolean result = attendant.isFilledBy(parkingLotOfSize10, 0.2);
        assertTrue(result);
    }

    @Test
    public void should_give_false_when_parking_lot_is_not_available_to_promote() throws InvalidParkingLotSizeException, NonAssignedParkingLotException, ParkingLotFullException {
        Attendant attendant = new Attendant();
        ParkingLot parkingLotOfSize10 = ParkingLot.createParkingLot(10);
        attendant.assign(parkingLotOfSize10);
        attendant.parkCarAt(parkingLotOfSize10,new Object());
        attendant.parkCarAt(parkingLotOfSize10,new Object());
        attendant.parkCarAt(parkingLotOfSize10,new Object());
        boolean result = attendant.isFilledBy(parkingLotOfSize10, 0.2);
        assertEquals(result,true);
    }

}