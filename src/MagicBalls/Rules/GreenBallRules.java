package MagicBalls.Rules;

import MagicBalls.Ball.Ball;
import MagicBalls.Ball.BallCantBeAddedException;
import MagicBalls.Ball.Balls;

public class GreenBallRules implements Rule{
    @Override
    public boolean canWeAddBall(Ball ball, Balls balls, int capacity) throws BallCantBeAddedException {
        int countOfBall = balls.countOfBalls(ball.getColor());
        int totalBalls = balls.countOfTotalBalls();
        if(countOfBall<3 && totalBalls < capacity) {
            balls.add(ball);
            return true;
        }
        throw new BallCantBeAddedException(ball.getColor());
    }
}
