package MagicBalls.Rules;

import MagicBalls.Ball.Ball;
import MagicBalls.Ball.BallCantBeAddedException;
import MagicBalls.Ball.Balls;

public interface Rule {
    public boolean canWeAddBall(Ball ball, Balls balls, int capacity) throws BallCantBeAddedException;
}
