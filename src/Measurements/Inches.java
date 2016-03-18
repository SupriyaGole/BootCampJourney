/*
    Job of Class:-
        convert centimeter into inches
 */
package Measurements;

public class Inches implements Scale {
    private double value;

    private Inches(double value) {
        this.value = value;
    }
    public static Inches create(double value){
        return new Inches(value);
    }

    @Override
    public double convertTo(Scale converter) {
        return 0;
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
