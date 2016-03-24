package MagicBalls.Ball;

public class Ball {
    private ColorOfBalls color;

    private Ball(ColorOfBalls color) {
        this.color = color;
    }

    public static Ball createGreenBall(){
        return new Ball(ColorOfBalls.GREEN);
    }


    public static Ball createRedBall(){
        return new Ball(ColorOfBalls.RED);
    }


    public static Ball createBlueBall(){
        return new Ball(ColorOfBalls.BLUE);
    }


    public static Ball createYellowBall(){
        return new Ball(ColorOfBalls.YELLOW);
    }

    public boolean isOfColor(ColorOfBalls colorOfBalls) {
        return color == colorOfBalls;
    }

    public ColorOfBalls getColor() {
        return color;
    }
}
