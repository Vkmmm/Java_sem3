package pr24;

public class IllegalTableNumber extends RuntimeException {
    public IllegalTableNumber(String ErrorMessage) {
        super(ErrorMessage);
    }
}
