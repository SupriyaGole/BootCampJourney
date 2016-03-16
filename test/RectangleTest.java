import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RectangleTest {
    @Test
    public void areaOfRectangle_should_be_natural_number_when_we_provide_height_and_width_as_a_natural_number() throws InvalidInputException {
        Rectangle rectangle = Rectangle.createRectangle(2, 3);
        double area = rectangle.calculateArea();
        assertEquals(area,6.0,0.001);
    }

    @Test(expected = InvalidInputException.class)
    public void invalidInputException_should_generate_when_we_provide_width_and_height_as_zero_or_less_than_zero () throws InvalidInputException {
        Rectangle.createRectangle(0,-1);
    }

    @Test
    public void perimeterOfRectangle_should_be_natural_number_when_we_provide_height_and_width_as_a_natural_number() throws InvalidInputException {
        Rectangle rectangle = Rectangle.createRectangle(2, 3);
        double perimeter = rectangle.calculatePerimeter();
        assertEquals(perimeter,10.0,0.001);
    }
}