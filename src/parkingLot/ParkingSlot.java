package parkingLot;

public class ParkingSlot {
    private Object assignedCar = null;

    public void addCar(Object car){
        assignedCar = car;
    }

    public boolean isEmpty() {
        return assignedCar == null;
    }
}
