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

    public String getHigherMeasurement(Unit otherMeasurement) {
        return this.value > otherMeasurement.value ? this.name() : otherMeasurement.name();
    }

    public double convertIntoHigherMeasurement(String unitOfOperation,double otherValue){
        return otherValue/value;
    }
}
