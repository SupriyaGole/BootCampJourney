/*
    Job of Class:-
    implement behaviours which use side as a parameter
    like calculating area and perimeter for square
 */
public class Square extends Rectangle {
    private Square(double side) {
        super(side, side);
    }

    public static Square createSquare(double side) throws InvalidInputException {
        if (side <= 0)
            throw new InvalidInputException(side);
        return new Square(side);
    }
}
