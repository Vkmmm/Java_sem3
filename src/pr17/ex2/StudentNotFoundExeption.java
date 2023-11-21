package pr17.ex2;

public class StudentNotFoundExeption extends RuntimeException {
    public StudentNotFoundExeption(String errorMessage) {
        super(errorMessage);
    }
}
