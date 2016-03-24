package MagicBalls.Ball;

public class BallCantBeAddedException extends Throwable {
    public BallCantBeAddedException(ColorOfBalls color) {
        super(color + " Ball limit exceeded");
    }
}
