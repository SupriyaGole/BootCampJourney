package Measurements;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class LengthComparatorTest {
    @Test
    public void compareLength_should_give_true_when_measurements_in_feet_and_inches_are_equal(){
        Scale feet = Feet.create(1);
        Scale inches = Inches.create(12);
        LengthComparator lengthComparator = LengthComparator.create(feet,inches);
        assertTrue(lengthComparator.compare());
    }

    @Test
    public void compareLength_should_give_true_when_measurements_in_centimeter_and_inches_are_equal() {
        Scale centimeter = Centimeter.create(5);
        Scale inches = Inches.create(2);
        LengthComparator lengthComparator = LengthComparator.create(centimeter,inches);
        assertTrue(lengthComparator.compare());
    }

    @Test
    public void compareLength_should_give_true_when_measurements_in_millimeter_and_centimeter_are_equal(){
        Scale millimeter = Millimeter.create(10);
        Scale centimeter = Centimeter.create(1);
        LengthComparator lengthComparator = LengthComparator.create(millimeter,centimeter);
        assertTrue(lengthComparator.compare());
    }

    @Test
    public void compareLength_should_give_true_when_measurements_in_gallon_and_liter_are_equal(){
        Scale gallon = Gallon.create(1);
        Scale liter = Liter.create(3.78);
        LengthComparator lengthComparator = LengthComparator.create(gallon,liter);
        assertTrue(lengthComparator.compare());
    }

    @Test
    public void compareLength_should_give_false_when_measurements_in_feet_and_inches_are_not_equal()  {
        Scale feet = Feet.create(2);
        Scale inches = Inches.create(12);
        LengthComparator lengthComparator = LengthComparator.create(feet,inches);
        assertFalse(lengthComparator.compare());
    }

    @Test
    public void compareLength_should_give_false_when_measurements_in_centimeter_and_inches_are_not_equal()  {
        Scale centimeter = Centimeter.create(2);
        Scale inches = Inches.create(12);
        LengthComparator lengthComparator = LengthComparator.create(centimeter,inches);
        assertFalse(lengthComparator.compare());
    }

    @Test
    public void two_measurements_should_add_itself_and_give_result_in_same_unit() {
        Inches measure1 = Inches.create(2);
        Inches measure2 = Inches.create(2);
        LengthComparator lengthComparator = LengthComparator.create(measure1, measure2);
        Scale add = lengthComparator.add();
    }
}