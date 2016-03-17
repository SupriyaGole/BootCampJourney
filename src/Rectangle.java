/*
    Job of Rectangle :-
    Rectangle should calculate area and perimeter
 */
public class Rectangle {
    private double height;
    private double width;

    protected Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }

    public static Rectangle createRectangle(double height, double width) throws InvalidInputException {
        if (height <= 0)
            throw new InvalidInputException(height);
        if (width <= 0)
            throw new InvalidInputException(width);
        else
            return new Rectangle(height, width);

    }

    public double calculateArea() {
        return height * width;
    }

    public double calculatePerimeter() {
        return 2 * (height + width);
    }
}
