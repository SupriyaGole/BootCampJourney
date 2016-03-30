package ParkingLotAssignment;

public class DecoratedObserver implements Observer{

    private Observer observer;

    public DecoratedObserver(Observer observer) {

        this.observer = observer;
    }

    @Override
    public void getNotified(int capacity, int noOfFilled) {

    }
}
