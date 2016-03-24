package MagicBalls.Rules;

import MagicBalls.Ball.Ball;
import MagicBalls.Ball.BallCantBeAddedException;
import MagicBalls.Ball.Balls;
import org.junit.*;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.assertEquals;

public class RedBallRulesTest {
    @org.junit.Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void should_add_maximum_of_twice_the_green_balls_minus_1() throws BallCantBeAddedException {
        Balls balls = new Balls();
        GreenBallRules greenBallRules = new GreenBallRules();
        Ball greenBall = Ball.createGreenBall();
        greenBallRules.canWeAddBall(greenBall,balls,12);
        RedBallRules redBallRules = new RedBallRules();
        Ball redBall = Ball.createRedBall();
        boolean result = redBallRules.canWeAddBall(redBall, balls, 12);
        assertEquals(true, result);
    }

    @Test
    public void should_throw_an_exception_when_green_ball_limit_exceeded() throws BallCantBeAddedException {
        thrown.expect(BallCantBeAddedException.class);
        thrown.expectMessage("RED Ball limit exceeded");
        Balls balls = new Balls();
        GreenBallRules greenBallRules = new GreenBallRules();
        Ball greenBall = Ball.createGreenBall();
        greenBallRules.canWeAddBall(greenBall,balls,12);
        RedBallRules redBallRules = new RedBallRules();
        Ball redBall = Ball.createRedBall();
        redBallRules.canWeAddBall(redBall, balls, 12);
        redBallRules.canWeAddBall(redBall, balls, 12);
    }
}