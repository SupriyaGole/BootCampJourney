package Measurements;

public class Liter implements Scale {
    private double value;

    private Liter(double value) {
        this.value = value;
    }
    public static Liter create(double value){
        return new Liter(value);
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
