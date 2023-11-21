package pr16;
import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner( System.in);
        System.out.print( "Enter an integer ");
        String intString = myScanner.next();
        int i;
        try {
            i = Integer.parseInt(intString);
        } catch (NumberFormatException e) {
            System.out.println("Non-integer input");
            return;
        }
        try {
            System.out.println(2 / i);
        } catch (ArithmeticException e) {
            System.out.println("Attempted division by zero");
        }
    }

}
