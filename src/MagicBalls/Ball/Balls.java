package MagicBalls.Ball;

import java.util.ArrayList;

public class Balls {

    private final ArrayList<Ball> balls;

    public Balls() {
        balls = new ArrayList<>();
    }

    public void add(Ball ball) {
        balls.add(ball);
    }

    public int countOfBalls(ColorOfBalls color) {
        int count = 0;
        for (Ball ball : balls) {
            if(ball.isOfColor(color)){
                count+=1;
            }
        }
        return count;
    }

    public int countOfTotalBalls() {
        return balls.size();
    }
}
