package Measurements;

public interface Scale {
    double convertTo(Scale converter);

    boolean isEqual(double convert);

    double getUnitValue();
}
