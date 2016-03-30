package ParkingLotAssignment;

public class Assistant implements Observer{
    private double threshold;

    public Assistant(double threshold) {

        this.threshold = threshold;
    }

    @Override
    public void getNotified(int capacity, int noOfFilled) {

    }
}
