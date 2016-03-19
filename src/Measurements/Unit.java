/*
    Job of enum:-
        for every measurement hold a equivalent base measurement value
        convert any unit of measurement into base measurement
        get higher measurement between given any two measurement
        convert result into whichever the highest measurement
 */

package Measurements;

public enum Unit {
    feet(300), inches(25), centimeter(10), millimeter(1), gallon(3.78), liter(1);

    private double value;

    Unit(double value) {
        this.value = value;
    }

    public double convertIntoBaseMeasurement(double measure) {
        return measure * this.value;
    }

    public String getHigherUnitOfMeasurement(Unit otherMeasurement) {
        return this.value > otherMeasurement.value ? this.name() : otherMeasurement.name();
    }

    public double convertIntoHigherUnitOfMeasurement(double otherValue){
        return otherValue/value;
    }
}
