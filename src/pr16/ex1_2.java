package pr16;

public class ex1_2 {
    public static void main(String[] args) {
        try{
            System.out.println( 2/0 );
        } catch ( ArithmeticException e ) {
            System.out.println("Attempted division by zero");
        }
    }
}
