package MagicBalls.Bag;/*
 * Job of Class:-
 *        add ball in bag when rules get matched with all condition
 */

import ExceptionHandler.BagSizeExceededException;
import ExceptionHandler.InvalidSizeException;
import MagicBalls.Ball.Ball;
import MagicBalls.Ball.BallCantBeAddedException;
import MagicBalls.Ball.Balls;
import MagicBalls.Rules.Rule;
import MagicBalls.Rules.Rules;

import java.util.ArrayList;
import java.util.List;

public class Bag {
    Balls balls = new Balls();
    private List<Ball> bag;
    private int capacity;
    private Rules rules;

    private Bag(int capacity,Rules rules) {
        this.capacity = capacity;
        this.rules = rules;
        this.bag = new ArrayList<>(capacity);
    }

    public static Bag create(int bagSize,Rules rules) throws InvalidSizeException {
        if (bagSize < 1 || bagSize > 12) {
            throw new InvalidSizeException(bagSize);
        }
        return new Bag(bagSize,rules);
    }

    public boolean isBagCreated() {
        return this.bag.size() < capacity;
    }

    public void putBall(Ball ball) throws IndexOutOfBoundsException, BagSizeExceededException, BagFullException, BallCantBeAddedException {
        if(isBagFull())
            throw new BagFullException();
        for (Rule rule : rules) {
            rule.canWeAddBall(ball,balls,capacity);
        }
        bag.add(ball);
    }

    public boolean isBagFull() {
        return bag.size() == capacity;
    }

    public int totalBalls() {
        return bag.size();
    }
}
