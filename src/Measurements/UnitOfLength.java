/*
    Job of enum:-
        for every measurement hold a equivalent base measurement value
        convert any unit of measurement into base measurement
        get higher measurement between given any two measurement
        convert result into whichever the highest measurement
 */

package Measurements;

public enum UnitOfLength implements Unit{
    FEET(300), INCHES(25), CENTIMETER(10), MILLIMETER(1), GALLON(3.78), LITER(1);

    private double value;

    UnitOfLength(double value) {
        this.value = value;
    }

    @Override
    public double convertToBaseMeasurement(double measure) {
        return this.value * measure;
    }

    public double convertIntoGivenUnit(double otherValue, UnitOfLength unitOfLength){
        return otherValue/ unitOfLength.value;
    }
}
