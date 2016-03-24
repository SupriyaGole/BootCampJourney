//package Measurements;
//
//import ExceptionHandler.InvalidMeasurementException;
//import org.junit.Rule;
//import org.junit.Test;
//import org.junit.rules.ExpectedException;
//
//import static org.junit.Assert.assertEquals;
//import static org.junit.Assert.assertTrue;
//
//public class MeasurementTest {
//
//    @Rule
//    public ExpectedException thrown = ExpectedException.none();
//
//    @Test
//    public void LengthMeasurement_should_throw_an_exception_when_the_input_value_is_a_nonpositive_value() throws InvalidMeasurementException {
//        thrown.expect(InvalidMeasurementException.class);
//        thrown.expectMessage("expected positive values but found measurement as -1");
//        Measurement.create(UnitOfLength.FEET,-1);
//    }
//
//    @Test
//    public void compareLength_should_give_true_when_measurements_in_feet_and_INCHES_are_equal() throws InvalidMeasurementException, Exception {
//        Measurement feetMeasurement = Measurement.create(UnitOfLength.FEET, 1);
//        Measurement inchMeasurement = Measurement.create(UnitOfLength.INCHES, 12);
//        boolean result = feetMeasurement.compare(inchMeasurement);
//        assertEquals(result,true);
//    }
//
//    @Test
//    public void compareLength_should_give_false_when_measurements_in_feet_and_INCHES_are_not_equal() throws InvalidMeasurementException, Exception {
//        Measurement feetMeasurement = Measurement.create(UnitOfLength.FEET, 2);
//        Measurement inchMeasurement = Measurement.create(UnitOfLength.INCHES, 12);
//        boolean result = feetMeasurement.compare(inchMeasurement);
//        assertEquals(result,false);
//    }
//
//
//    @Test
//    public void compareLength_should_give_true_when_measurements_in_INCHES_and_centimeters_are_equal() throws InvalidMeasurementException, Exception {
//        Measurement centimeterMeasurement = Measurement.create(UnitOfLength.CENTIMETER, 5);
//        Measurement inchMeasurement = Measurement.create(UnitOfLength.INCHES, 2);
//        boolean result = centimeterMeasurement.compare(inchMeasurement);
//        assertEquals(result,true);
//    }
//
//    @Test
//    public void compareLength_should_give_false_when_measurements_in_centimeters_and_INCHES_are_not_equal() throws InvalidMeasurementException, Exception {
//        Measurement centimeterMeasurement = Measurement.create(UnitOfLength.CENTIMETER, 3);
//        Measurement inchMeasurement = Measurement.create(UnitOfLength.INCHES, 12);
//        boolean result = centimeterMeasurement.compare(inchMeasurement);
//        assertEquals(result,false);
//    }
//
//    @Test
//    public void compareLength_should_give_true_when_measurements_in_millimeter_and_centimeters_are_equal() throws InvalidMeasurementException, Exception {
//        Measurement centimeterMeasurement = Measurement.create(UnitOfLength.CENTIMETER, 1);
//        Measurement millimeterMeasurement = Measurement.create(UnitOfLength.MILLIMETER, 10);
//        boolean result = centimeterMeasurement.compare(millimeterMeasurement);
//        assertEquals(result,true);
//    }
//
//    @Test
//    public void compareLength_should_give_false_when_measurements_in_centimeters_and_millimeter_are_not_equal() throws InvalidMeasurementException, Exception {
//        Measurement centimeterMeasurement = Measurement.create(UnitOfLength.CENTIMETER, 3);
//        Measurement millimeterMeasurement = Measurement.create(UnitOfLength.MILLIMETER, 12);
//        boolean result = centimeterMeasurement.compare(millimeterMeasurement);
//        assertEquals(result,false);
//    }
//
//    @Test
//    public void compareLength_should_give_true_when_measurements_in_gallons_and_liters_are_equal() throws InvalidMeasurementException, Exception {
//        Measurement gallonMeasurement = Measurement.create(UnitOfLength.GALLON, 1);
//        Measurement literMeasurement = Measurement.create(UnitOfLength.LITER, 3.78);
//        boolean result = gallonMeasurement.compare(literMeasurement);
//        assertEquals(result,true);
//    }
//
//    @Test
//    public void compareLength_should_give_false_when_measurements_in_gallons_and_liters_are_not_equal() throws InvalidMeasurementException, Exception {
//        Measurement centimeterMeasurement = Measurement.create(UnitOfLength.GALLON, 3);
//        Measurement millimeterMeasurement = Measurement.create(UnitOfLength.LITER, 12);
//        boolean result = centimeterMeasurement.compare(millimeterMeasurement);
//        assertEquals(result,false);
//    }
//
//    @Test
//    public void add_should_add_different_unit_of_measurement_and_returns_the_result() throws InvalidMeasurementException, Exception {
//        Measurement inchMeasurement1 = Measurement.create(UnitOfLength.INCHES, 2);
//        Measurement inchMeasurement2 = Measurement.create(UnitOfLength.CENTIMETER, 2.5);
//        Measurement sumOfMeasurement = inchMeasurement1.add(inchMeasurement2, UnitOfLength.INCHES);
//        Measurement expected = Measurement.create(UnitOfLength.INCHES,3);
//        assertTrue(sumOfMeasurement.equals(expected));
//    }
//
//    @Test
//    public void add_should_add_same_unit_of_measurement_and_returns_the_result() throws InvalidMeasurementException, Exception {
//        Measurement inchMeasurement1 = Measurement.create(UnitOfLength.INCHES, 2);
//        Measurement inchMeasurement2 = Measurement.create(UnitOfLength.INCHES, 2);
//        Measurement sumOfMeasurement = inchMeasurement1.add(inchMeasurement2, UnitOfLength.INCHES);
//        Measurement expected = Measurement.create(UnitOfLength.INCHES,4);
//        assertTrue(sumOfMeasurement.equals(expected));
//    }
//}