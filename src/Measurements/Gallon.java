package Measurements;

public class Gallon implements Scale {
    private double value;

    private Gallon(double value) {
        this.value = value;
    }
    public static Gallon create(double value){
        return new Gallon(value);
    }

    @Override
    public double convertTo(Scale converter) {
        double result = 0;
        if(converter instanceof Liter)
            result = value * Unit.gallon_to_liter.getUnitValue();
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
