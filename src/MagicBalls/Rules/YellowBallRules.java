package MagicBalls.Rules;

import MagicBalls.Ball.Ball;
import MagicBalls.Ball.BallCantBeAddedException;
import MagicBalls.Ball.Balls;

public class YellowBallRules implements Rule {
    @Override
    public boolean canWeAddBall(Ball ball, Balls balls, int capacity) throws BallCantBeAddedException {
        int countOfYellowBall = balls.countOfBalls(ball.getColor());
        if(countOfYellowBall < balls.countOfTotalBalls() * 0.4 && balls.countOfTotalBalls() < capacity) {
            balls.add(ball);
            return true;
        }
        throw new BallCantBeAddedException(ball.getColor());
    }
}
