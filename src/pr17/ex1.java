package pr17;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.Scanner;
public class ex1 {
    public static void main(String[] args) {
        try {
            Scanner in = new Scanner(System.in);
            System.out.println("Введите фамилию и имя без пробелов: ");
            String fullName = in.nextLine();
            System.out.println("Введите ИНН");
            String inn = in.next();

            if (isValidINN(inn)) {
                System.out.println("Заказ успешно оформлен на: " + fullName);
            } else {
                throw new Exception("ИНН: " + inn);
            }
        } catch (Exception e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }

    private static boolean isValidINN(String inn) {
        if (inn.length() != 12) {
            return false;
        }

        if (!inn.matches("\\d{12}")) {
            return false;
        }

        int[] coefficients = {7, 2, 4, 10, 3, 5, 9, 4, 6, 8};
        int controlSum = Character.getNumericValue(inn.charAt(11));
        int calculatedControlSum = 0;

        for (int i = 0; i < 10; i++) {
            calculatedControlSum += Character.getNumericValue(inn.charAt(i)) * coefficients[i];
        }

        calculatedControlSum %= 11;
        if (calculatedControlSum == 10) {
            calculatedControlSum = 0;
        }
        return controlSum == calculatedControlSum;
    }
}
