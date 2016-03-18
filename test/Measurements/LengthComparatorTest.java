package Measurements;

import ExceptionHandler.InvalidMeasurementException;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class LengthComparatorTest {

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void LengthMeasurement_should_throw_an_exception_when_the_input_value_is_a_nonpositive_value() throws InvalidMeasurementException {
        thrown.expect(InvalidMeasurementException.class);
        thrown.expectMessage("expected positive values but found measurement as -1");
        Measurement.create(Unit.feet,-1);
    }

    @Test
    public void compareLength_should_give_true_when_measurements_in_feet_and_inches_are_equal() throws InvalidMeasurementException {
        Measurement feetMeasurement = Measurement.create(Unit.feet, 1);
        Measurement inchMeasurement = Measurement.create(Unit.inches, 12);
        boolean result = feetMeasurement.compare(inchMeasurement);
        assertEquals(result,true);
    }

    @Test
    public void compareLength_should_give_false_when_measurements_in_feet_and_inches_are_not_equal() throws InvalidMeasurementException {
        Measurement feetMeasurement = Measurement.create(Unit.feet, 2);
        Measurement inchMeasurement = Measurement.create(Unit.inches, 12);
        boolean result = feetMeasurement.compare(inchMeasurement);
        assertEquals(result,false);
    }


    @Test
    public void compareLength_should_give_true_when_measurements_in_inches_and_centimeters_are_equal() throws InvalidMeasurementException {
        Measurement centimeterMeasurement = Measurement.create(Unit.centimeter, 5);
        Measurement inchMeasurement = Measurement.create(Unit.inches, 2);
        boolean result = centimeterMeasurement.compare(inchMeasurement);
        assertEquals(result,true);
    }

    @Test
    public void compareLength_should_give_false_when_measurements_in_centimeters_and_inches_are_not_equal() throws InvalidMeasurementException {
        Measurement centimeterMeasurement = Measurement.create(Unit.centimeter, 3);
        Measurement inchMeasurement = Measurement.create(Unit.inches, 12);
        boolean result = centimeterMeasurement.compare(inchMeasurement);
        assertEquals(result,false);
    }

    @Test
    public void compareLength_should_give_true_when_measurements_in_millimeter_and_centimeters_are_equal() throws InvalidMeasurementException {
        Measurement centimeterMeasurement = Measurement.create(Unit.centimeter, 1);
        Measurement millimeterMeasurement = Measurement.create(Unit.millimeter, 10);
        boolean result = centimeterMeasurement.compare(millimeterMeasurement);
        assertEquals(result,true);
    }

    @Test
    public void compareLength_should_give_false_when_measurements_in_centimeters_and_millimeter_are_not_equal() throws InvalidMeasurementException {
        Measurement centimeterMeasurement = Measurement.create(Unit.centimeter, 3);
        Measurement millimeterMeasurement = Measurement.create(Unit.millimeter, 12);
        boolean result = centimeterMeasurement.compare(millimeterMeasurement);
        assertEquals(result,false);
    }

    @Test
    public void compareLength_should_give_true_when_measurements_in_gallons_and_liters_are_equal() throws InvalidMeasurementException {
        Measurement gallonMeasurement = Measurement.create(Unit.gallon, 1);
        Measurement literMeasurement = Measurement.create(Unit.liter, 3.78);
        boolean result = gallonMeasurement.compare(literMeasurement);
        assertEquals(result,true);
    }

    @Test
    public void compareLength_should_give_false_when_measurements_in_gallons_and_liters_are_not_equal() throws InvalidMeasurementException {
        Measurement centimeterMeasurement = Measurement.create(Unit.gallon, 3);
        Measurement millimeterMeasurement = Measurement.create(Unit.liter, 12);
        boolean result = centimeterMeasurement.compare(millimeterMeasurement);
        assertEquals(result,false);
    }

    @Test
    public void add_should_add_different_unit_of_measurement_and_returns_the_result() throws InvalidMeasurementException {
        Measurement inchMeasurement1 = Measurement.create(Unit.inches, 2);
        Measurement inchMeasurement2 = Measurement.create(Unit.centimeter, 2.5);
        Measurement sumOfMeasurement = inchMeasurement1.add(inchMeasurement2);
        Measurement expected = Measurement.create(Unit.inches,3);
        assertTrue(sumOfMeasurement.equals(expected));
    }
}