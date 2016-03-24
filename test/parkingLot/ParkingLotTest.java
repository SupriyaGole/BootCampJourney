package parkingLot;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.assertEquals;

public class ParkingLotTest {

    private ParkingLot parkingLot;

    @Before
    public void setUp() throws Exception, InvalidParkingLotSizeException {
        parkingLot = ParkingLot.createParkingLot(10);
    }

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void should_throw_InvalidParkingLotSizeException_when_given_size_is_less_than_equal_to_zero() throws InvalidParkingLotSizeException {
        thrown.expect(InvalidParkingLotSizeException.class);
        thrown.expectMessage("Expected parking lot size as a positive integer but found -1");
        ParkingLot.createParkingLot(-1);
    }

    @Test
    public void should_park_a_car_space_is_available(){
        Car car = new Car();
        parkingLot.park(car);
        parkingLot.park(car);
        parkingLot.park(car);
        assertEquals(3,parkingLot.totalParkedCar());
    }

    @Test
    public void should_return_true_when_parking_is_full() throws InvalidParkingLotSizeException {
        ParkingLot parkingLot = ParkingLot.createParkingLot(1);
        Car car = new Car();
        parkingLot.park(car);
        assertEquals(true,parkingLot.isFull());
    }
}