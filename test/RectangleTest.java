import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.assertEquals;

public class RectangleTest {

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void areaOfRectangle_should_be_natural_number_when_we_provide_height_and_width_as_a_natural_number() throws InvalidInputException {
        Rectangle rectangle = Rectangle.createRectangle(2, 3);
        double area = rectangle.calculateArea();
        assertEquals(area, 6.0, 0.001);
    }

    @Test
    public void invalidInputException_should_generate_when_we_provide_width_and_height_as_zero() throws InvalidInputException {
        thrown.expect(InvalidInputException.class);
        thrown.expectMessage("expected natural number but found 0");
        Rectangle.createRectangle(0, 0);
    }

    @Test
    public void invalidInputException_should_generate_when_we_provide_width_and_height_negative_numbers() throws InvalidInputException {
        thrown.expect(InvalidInputException.class);
        thrown.expectMessage("expected natural number but found -10");
        Rectangle.createRectangle(-10, -20);
    }

    @Test
    public void invalidInputException_should_generate_when_we_provide_width_as_zero_and_height_As_natural_number() throws InvalidInputException {
        thrown.expect(InvalidInputException.class);
        thrown.expectMessage("expected natural number but found 0");
        Rectangle.createRectangle(10, 0);
    }

    @Test
    public void perimeterOfRectangle_should_be_natural_number_when_we_provide_height_and_width_as_a_natural_number() throws InvalidInputException {
        Rectangle rectangle = Rectangle.createRectangle(2, 3);
        double perimeter = rectangle.calculatePerimeter();
        assertEquals(perimeter, 10.0, 0.001);
    }
}