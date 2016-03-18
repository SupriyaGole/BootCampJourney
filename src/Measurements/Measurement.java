/*
    Job of Class:-
    Compare two measurements
 */
package Measurements;

import ExceptionHandler.InvalidMeasurementException;

public class Measurement {
    private final Unit unit;
    private final double value;

    private Measurement(Unit unit, double value) {
        this.unit = unit;
        this.value = value;
    }

    public static Measurement create(Unit unit, double value) throws InvalidMeasurementException {
        if (value < 0) throw new InvalidMeasurementException(value);
        return new Measurement(unit, value);
    }

    public boolean compare(Measurement comparator) {
        return this.unit.convertIntoBaseMeasurement(value) == comparator.unit.convertIntoBaseMeasurement(comparator.value);
    }

    public Measurement add(Measurement otherMeasurement) throws InvalidMeasurementException {
        double sum = 0;
        String unitOfOperation = "";
        if (this.unit.name().equals(otherMeasurement.unit.name())) {
            sum = this.value + otherMeasurement.value;
            unitOfOperation = this.unit.name();
        }
        else{
            double sumInBaseMeasurement = addDifferentUnitValues(otherMeasurement);
            unitOfOperation = unit.getHigherMeasurement(otherMeasurement.unit);
            sum = unit.convertIntoHigherMeasurement(unitOfOperation,sumInBaseMeasurement);
        }
        return Measurement.create(unit.valueOf(unitOfOperation), sum);
    }

    private double addDifferentUnitValues(Measurement otherMeasurement){
        return this.unit.convertIntoBaseMeasurement(value) + otherMeasurement.unit.convertIntoBaseMeasurement(otherMeasurement.value);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Measurement that = (Measurement) o;
        if (Double.compare(that.value, value) != 0) return false;
        return unit == that.unit;
    }
}
