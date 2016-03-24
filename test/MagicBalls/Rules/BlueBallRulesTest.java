package MagicBalls.Rules;

import MagicBalls.Ball.Ball;
import MagicBalls.Ball.BallCantBeAddedException;
import MagicBalls.Ball.Balls;
import org.junit.*;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.assertEquals;

public class BlueBallRulesTest {
    @org.junit.Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void should_add_maximum_blue_balls_that_can_fit_into_the_bag() throws BallCantBeAddedException {
        Balls balls = new Balls();
        Ball blueBall = Ball.createBlueBall();
        BlueBallRules blueBallRules = new BlueBallRules();
        boolean result = blueBallRules.canWeAddBall(blueBall, balls, 2);
        assertEquals(true,result);
    }

    @Test
    public void should_throw_an_exception_when_blue_ball_limit_exceeded() throws BallCantBeAddedException {
        thrown.expect(BallCantBeAddedException.class);
        thrown.expectMessage("BLUE Ball limit exceeded");
        GreenBallRules greenBallRules = new GreenBallRules();
        BlueBallRules blueBallRules = new BlueBallRules();
        Balls balls = new Balls();
        Ball greenBall = Ball.createGreenBall();
        Ball blueBall = Ball.createBlueBall();
        greenBallRules.canWeAddBall(greenBall, balls, 3);
        greenBallRules.canWeAddBall(greenBall, balls, 3);
        greenBallRules.canWeAddBall(greenBall, balls, 3);
        blueBallRules.canWeAddBall(blueBall, balls, 3);
    }
}