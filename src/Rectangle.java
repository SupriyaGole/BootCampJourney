/*
    Job of Rectangle :-
    Rectangle should calculate area and perimeter
 */
public class Rectangle {
    private double height;
    private double width;

    private Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }

    public static Rectangle createRectangle(double height, double width) throws InvalidInputException {
        if (height <= 0 && width <= 0) {
            throw new InvalidInputException();
        } else
            return new Rectangle(height, width);
    }

    public double calculateArea() {
        return height * width;
    }

    public double calculatePerimeter() {
        return 2 * (height + width);
    }
}
