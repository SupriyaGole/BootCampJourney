package MagicBalls;

import ExceptionHandler.BagSizeExceededException;
import ExceptionHandler.InvalidSizeException;
import MagicBalls.Bag.Bag;
import MagicBalls.Bag.BagFullException;
import MagicBalls.Ball.Ball;
import MagicBalls.Ball.BallCantBeAddedException;
import MagicBalls.Rules.GreenBallRules;
import MagicBalls.Rules.Rules;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.assertEquals;

public class BagTest {
    @Rule
    public ExpectedException thrown = ExpectedException.none();


    @Test
    public void should_be_able_to_hold_a_maximum_of_12_balls() throws InvalidSizeException {
        thrown.expect(InvalidSizeException.class);
        thrown.expectMessage("expected bag size between 0 to 12 but found 13");
        Rules rules = new Rules();
        rules.add(new GreenBallRules());
        Bag.create(13, rules);
    }

    @Test
    public void should_throw_exception_when_bag_is_full() throws InvalidSizeException, BallCantBeAddedException, BagSizeExceededException, BagFullException {
        thrown.expect(BagFullException.class);
        thrown.expectMessage("Bag is Full. can't add more balls");
        Rules rules = new Rules();
        rules.add(new GreenBallRules());
        Bag bag = Bag.create(2, rules);
        Ball greenBall = Ball.createGreenBall();
        bag.putBall(greenBall);
        bag.putBall(greenBall);
        bag.putBall(greenBall);
    }

    @Test
    public void should_be_able_to_create_a_bag_of_maximum_of_12_balls() throws InvalidSizeException {
        Rules rules = new Rules();
        rules.add(new GreenBallRules());
        Bag bag = Bag.create(12, rules);
        boolean bagCreated = bag.isBagCreated();
        assertEquals(bagCreated, true);
    }

    @Test
    public void should_only_allow_to_store_given_ball_if_it_satisfies_the_rule() throws InvalidSizeException, BagSizeExceededException, BagFullException, BallCantBeAddedException {
        Rules rules = new Rules();
        rules.add(new GreenBallRules());
        Bag bag = Bag.create(12, rules);
        Ball greenBall1 = Ball.createGreenBall();
        Ball greenBall2 = Ball.createGreenBall();
        Ball greenBall3 = Ball.createGreenBall();
        bag.putBall(greenBall1);
        bag.putBall(greenBall2);
        bag.putBall(greenBall3);
        Assert.assertEquals(3, bag.totalBalls());
    }


    @Test
    public void should_throw_an_exception_when_ball_does_not_satisfies_the_rule() throws InvalidSizeException, BagSizeExceededException, BagFullException, BallCantBeAddedException {
        thrown.expect(BallCantBeAddedException.class);
        thrown.expectMessage("GREEN Ball limit exceeded");
        Rules rules = new Rules();
        rules.add(new GreenBallRules());
        Bag bag = Bag.create(12, rules);
        Ball greenBall1 = Ball.createGreenBall();
        Ball greenBall2 = Ball.createGreenBall();
        Ball greenBall3 = Ball.createGreenBall();
        bag.putBall(greenBall1);
        bag.putBall(greenBall2);
        bag.putBall(greenBall3);
        bag.putBall(greenBall3);
    }

    @Test
    public void should_provide_summary_of_bag_in_composite_order() throws InvalidSizeException {
        Rules rules = new Rules();
        rules.add(new GreenBallRules());
        rules.add(new GreenBallRules());
        rules.add(new GreenBallRules());
        Bag.create(12,rules);
    }
}