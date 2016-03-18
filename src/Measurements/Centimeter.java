/*
    Job of Class:-
        convert centimeter into inches
 */
package Measurements;

public class Centimeter implements Scale {
    private double value;

    private Centimeter(double value) {
        this.value = value;
    }
    public static Centimeter create(double value){
        return new Centimeter(value);
    }

    @Override
    public double convertTo(Scale converter) {
        double result = 0;
        if (converter instanceof Inches)
            result = value / Unit.centimeter_to_inches.getUnitValue();
        return result;
    }

    @Override
    public boolean isEqual(double convert) {
        return value == convert;
    }

    @Override
    public double getUnitValue() {
        return value;
    }

}
