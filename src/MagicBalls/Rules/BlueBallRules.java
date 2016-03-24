package MagicBalls.Rules;

import MagicBalls.Ball.Ball;
import MagicBalls.Ball.BallCantBeAddedException;
import MagicBalls.Ball.Balls;

public class BlueBallRules implements Rule {
    @Override
    public boolean canWeAddBall(Ball ball, Balls balls, int capacity) throws BallCantBeAddedException {
        if(balls.countOfTotalBalls() < capacity) {
            balls.add(ball);
            return true;
        }
        throw new BallCantBeAddedException(ball.getColor());
    }
}
