package parkingLot;

import java.util.ArrayList;

public class ParkingLot {
    private final ArrayList<ParkingLotObserver> parkingLotObservers= new ArrayList<>();
    private final ArrayList<ParkingSlot> parkingLot;
    private int size;

    public ParkingLot(ArrayList<ParkingSlot> allSlots, int size) {
        parkingLot = allSlots;
        this.size = size;
    }

    public static ParkingLot createParkingLot(int size) throws InvalidParkingLotSizeException {
        if (size < 1)
            throw new InvalidParkingLotSizeException(size);
        ArrayList<ParkingSlot> allSlots = initializeParkingSlot(size);
        return new ParkingLot(allSlots,size);
    }

    private static ArrayList<ParkingSlot> initializeParkingSlot(int size) {
        ArrayList<ParkingSlot> lots = new ArrayList<>();
        for (int index = 0; index < size; index++) lots.add(new ParkingSlot());
        return lots;
    }


    public boolean park(Object car) throws ParkingLotFullException {
        int firstEmptySlotIndex = getFirstEmptySlotIndex();
        if (firstEmptySlotIndex == -1) throw new ParkingLotFullException();
        parkingLot.get(firstEmptySlotIndex).addCar(car);
        return true;
    }

    private int getFirstEmptySlotIndex() {
        int index = -1;
        for (int counter = 0; counter < parkingLot.size(); counter++)
            if (parkingLot.get(counter).isEmpty())
                return counter;
        return index;
    }

    public int totalParkedCar() {
        int counter = 0;
        for (ParkingSlot parkingSlot : parkingLot)
            if (!parkingSlot.isEmpty())
                counter++;
        return counter;
    }

    public boolean isFull() {
        for (ParkingSlot parkingSlot : parkingLot)
            if (parkingSlot.isEmpty())
                return false;
        return true;
    }
}
