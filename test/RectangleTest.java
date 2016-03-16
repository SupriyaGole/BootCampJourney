import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RectangleTest {
    @Test
    public void testcalculateAreaShouldCalculateTheAreaAccordingToHeightAndWidth() throws Exception {
        Rectangle rectangle = new Rectangle(2, 3);
        double area = rectangle.calculateArea();
        assertEquals(area,6.0,0.001);
    }

    @Test
    public void testcalculatePerimeterShouldCalculateThePerimeterAccordingToHeightAndWidth() throws Exception {
        Rectangle rectangle = new Rectangle(2, 3);
        double perimeter = rectangle.calculatePerimeter();
        assertEquals(perimeter,10.0,0.001);
    }
}