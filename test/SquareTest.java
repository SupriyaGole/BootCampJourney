import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.assertEquals;

public class SquareTest {
    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void areaOfSquare_should_be_natural_number_when_we_provide_height_and_width_as_a_natural_number() throws InvalidInputException {
        Square square = Square.createSquare(4);
        double area = square.calculateArea();
        assertEquals(area, 16.0, 0.001);
    }

    @Test
    public void perimeterOfSquare_should_be_natural_number_when_we_provide_height_and_width_as_a_natural_number() throws InvalidInputException {
        Square square = Square.createSquare(4);
        double perimeter = square.calculatePerimeter();
        assertEquals(perimeter, 16.0 , 0.001);
    }

    @Test
    public void invalidInputException_should_generate_when_we_provide_width_and_height_as_zero() throws InvalidInputException {
        thrown.expect(InvalidInputException.class);
        Square.createSquare(0);
        thrown.expectMessage("expected natural number but found 0");
    }

    @Test
    public void invalidInputException_should_generate_when_we_provide_width_and_height_negative_numbers() throws InvalidInputException {
        thrown.expect(InvalidInputException.class);
        Square.createSquare(-10);
        thrown.expectMessage("expected natural number but found -10");
    }
}