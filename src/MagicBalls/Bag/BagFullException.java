package MagicBalls.Bag;

public class BagFullException extends Throwable {
    public BagFullException() {
        super("Bag is Full. can't add more balls");
    }
}
