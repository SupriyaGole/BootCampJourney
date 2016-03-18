/*
    Job of Class:-
    Compare two measurements
 */
package Measurements;

public class LengthComparator {

    private final Scale measure1;
    private final Scale measure2;
    private Inches inches;

    private LengthComparator(Scale measure1, Scale measure2) {
        this.measure1 = measure1;
        this.measure2 = measure2;
    }

    public static LengthComparator create(Scale measure1, Scale measure2) {
//        if(measure1<0 || measure2<0)
//            throw new InvalidMeasurementException(measure1,measure2);
        return new LengthComparator(measure1, measure2);
    }

    public boolean compare() {
        double convert = convert(measure1, measure2);
        return measure2.isEqual(convert);
    }

    private double convert(Scale measure1, Scale measure2) {
        return measure1.convertTo(measure2);
    }

    public Scale add() {
        if (measure1.getClass() == measure2.getClass()) {
            if (measure1 instanceof Inches) {
                inches = Inches.create(measure1.getUnitValue() + measure2.getUnitValue());
            }
        }
        return inches;
    }
}
