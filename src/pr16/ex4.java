package pr16;
import java.util.Scanner;
public class ex4 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        String intString = myScanner.next();
        int i = 0;

        try {
            i = Integer.parseInt(intString);

            if (i != 0) {
                System.out.println(2 / i);
            } else {
                System.out.println("Attempted division by zero");
            }
        } catch (NumberFormatException e) {
            System.out.println("Non-integer input detected");
        } finally {
            // Этот блок будет выполнен всегда, независимо от исключений
            myScanner.close(); // Закрываем Scanner в блоке finally
        }
    }
}
