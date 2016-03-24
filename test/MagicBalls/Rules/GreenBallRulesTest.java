package MagicBalls.Rules;

import MagicBalls.Ball.Ball;
import MagicBalls.Ball.BallCantBeAddedException;
import MagicBalls.Ball.Balls;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.assertEquals;

public class GreenBallRulesTest {
    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void should_add_maximum_three_green_balls() throws BallCantBeAddedException {
        GreenBallRules greenBallRules = new GreenBallRules();
        Ball greenBall = Ball.createGreenBall();
        boolean result = greenBallRules.canWeAddBall(greenBall, new Balls(), 12);
        assertEquals(true,result);
    }

    @Test
    public void should_throw_an_exception_when_green_ball_limit_exceeded() throws BallCantBeAddedException {
        thrown.expect(BallCantBeAddedException.class);
        thrown.expectMessage("GREEN Ball limit exceeded");
        GreenBallRules greenBallRules = new GreenBallRules();
        Balls balls = new Balls();
        Ball greenBall = Ball.createGreenBall();
        greenBallRules.canWeAddBall(greenBall, balls, 12);
        greenBallRules.canWeAddBall(greenBall, balls, 12);
        greenBallRules.canWeAddBall(greenBall, balls, 12);
        greenBallRules.canWeAddBall(greenBall, balls, 12);
    }
}