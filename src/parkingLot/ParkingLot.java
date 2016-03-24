package parkingLot;

import java.util.ArrayList;

public class ParkingLot {
    private int size;
    private final ArrayList<Car> parkingLot;

    public ParkingLot(int size) {
        this.size = size;
        parkingLot = new ArrayList<>(size);
    }

    public static ParkingLot createParkingLot(int size) throws InvalidParkingLotSizeException {
        if(size<1)
            throw new InvalidParkingLotSizeException(size);
        return new ParkingLot(size);
    }

    public void park(Car car) {
        parkingLot.add(car);
    }

    public int totalParkedCar() {
        return parkingLot.size();
    }

    public boolean isFull() {
        return parkingLot.size() == size;
    }
}
