package pr16;
import java.util.Scanner;
public class ex8 {
    public void getKey() {
        boolean validKeyEntered = false;
        Scanner myScanner = new Scanner(System.in);

        while (!validKeyEntered) {
            try {
                System.out.print("Enter a key: ");
                String key = myScanner.next();
                printDetails(key);
                validKeyEntered = true;
            } catch (Exception e) {
                System.out.println("Caught Exception: " + e.getMessage());
                System.out.println("Please try again.");
            }
        }
    }

    public void printDetails(String key) throws Exception {
        String message = getDetails(key);
        System.out.println(message);
    }

    private String getDetails(String key) throws Exception {
        if (key.equals("")) {
            throw new Exception("Key set to empty string");
        }
        return "data for " + key;
    }

    public static void main(String[] args) {
        ex8 demo = new ex8();
        demo.getKey();
    }
}
