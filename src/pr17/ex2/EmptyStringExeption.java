package pr17.ex2;

public class EmptyStringExeption extends RuntimeException {
    public EmptyStringExeption(String errorMessage) {
        super(errorMessage);
    }
}
