package Measurements;

public class Millimeter implements Scale {
    private double value;

    private Millimeter(double value) {
        this.value = value;
    }

    public static Millimeter create(double value) {
        return new Millimeter(value);
    }

    @Override
    public double convertTo(Scale converter) {
        double result = 0;
        if (converter instanceof Centimeter)
            result = value / Unit.millimeter_to_centimeter.getUnitValue();
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
