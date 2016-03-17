/*
    Job of Class:-
        Associate message with the exception
 */
public class InvalidInputException extends Exception {

    public InvalidInputException(double measurement) {
        super("expected natural number but found "+measurement);
    }
}
