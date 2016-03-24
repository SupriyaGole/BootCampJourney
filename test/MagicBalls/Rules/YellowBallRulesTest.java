package MagicBalls.Rules;

import MagicBalls.Ball.Ball;
import MagicBalls.Ball.BallCantBeAddedException;
import MagicBalls.Ball.Balls;
import org.junit.*;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.assertEquals;

public class YellowBallRulesTest {
    @org.junit.Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void should_add_maximum_of_40_percent_of_total_balls_in_the_bag() throws BallCantBeAddedException {
        Balls balls = new Balls();

        GreenBallRules greenBallRules = new GreenBallRules();
        Ball greenBall = Ball.createGreenBall();
        greenBallRules.canWeAddBall(greenBall,balls,12);
        greenBallRules.canWeAddBall(greenBall,balls,12);

        RedBallRules redBallRules = new RedBallRules();
        Ball redBall = Ball.createRedBall();
        redBallRules.canWeAddBall(redBall,balls,12);
        redBallRules.canWeAddBall(redBall,balls,12);

        Ball yellowBall = Ball.createYellowBall();
        YellowBallRules yellowBallRules = new YellowBallRules();
        yellowBallRules.canWeAddBall(yellowBall,balls,12);
        boolean result = yellowBallRules.canWeAddBall(yellowBall, balls, 12);
        assertEquals(true,result);
    }

    @Test
    public void should_throw_an_exception_when_yellow_ball_limit_exceeded() throws BallCantBeAddedException {
        thrown.expect(BallCantBeAddedException.class);
        thrown.expectMessage("YELLOW Ball limit exceeded");
        Balls balls = new Balls();
        YellowBallRules yellowBallRules = new YellowBallRules();
        Ball yellowBall = Ball.createYellowBall();
        yellowBallRules.canWeAddBall(yellowBall,balls,12);
    }
}