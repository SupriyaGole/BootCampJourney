package MagicBalls.Ball;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BallsTest {

    private Balls balls;

    @Before
    public void setUp() throws Exception {
        balls = new Balls();
    }

    @Test
    public void should_able_to_Add_ball() {
        Ball redBall = Ball.createRedBall();
        balls.add(redBall);
        assertEquals(1,balls.countOfTotalBalls());
    }

    @Test
    public void should_give_the_count_of_given_color_balls_in_the_balls_list() {
        Ball redBall = Ball.createRedBall();
        balls.add(redBall);
        balls.add(redBall);
        int count = balls.countOfBalls(ColorOfBalls.RED);
        assertEquals(2,count);
    }
}