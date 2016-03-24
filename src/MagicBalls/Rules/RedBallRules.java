package MagicBalls.Rules;

import MagicBalls.Ball.Ball;
import MagicBalls.Ball.BallCantBeAddedException;
import MagicBalls.Ball.Balls;
import MagicBalls.Ball.ColorOfBalls;

public class RedBallRules implements Rule {
    @Override
    public boolean canWeAddBall(Ball ball, Balls balls, int capacity) throws BallCantBeAddedException {
        int countOfGreenBalls = balls.countOfBalls(ColorOfBalls.GREEN);
        int countOfRedBalls = balls.countOfBalls(ball.getColor());
        if (countOfRedBalls < (countOfGreenBalls * 2) - 1 && balls.countOfTotalBalls() < capacity) {
            balls.add(ball);
            return true;
        }
        throw new BallCantBeAddedException(ball.getColor());
    }
}
