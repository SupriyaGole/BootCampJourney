package Measurements;

public class Feet implements Scale {
    private double value;

    private Feet(double value) {
        this.value = value;
    }
    public static Feet create(double value){
        return new Feet(value);
    }

    @Override
    public double convertTo(Scale converter) {
        double result = 0;
        if (converter instanceof Inches) {
            result = value * Unit.feet_to_inches.getUnitValue();
        }
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
