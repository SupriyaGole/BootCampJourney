package Measurements;

public enum Unit {
    feet_to_inches(12),
    centimeter_to_inches(2.5),
    millimeter_to_centimeter(10),
    gallon_to_liter(3.78);

    private double unitValue;

    Unit(double unitValue) {

        this.unitValue = unitValue;
    }

    public double getUnitValue(){
        return unitValue;
    }
}
