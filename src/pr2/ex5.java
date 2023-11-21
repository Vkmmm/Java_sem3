package pr2;
import java.util.Scanner;



public class ex5 {
    public static long calculateFactorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Факториал определен только для неотрицательных чисел.");
        }

        long factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }

        return factorial;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите целое число для вычисления факториала: ");

        if (scanner.hasNextInt()) {
            int number = scanner.nextInt();

            try {
                long factorial = calculateFactorial(number);
                System.out.println("Факториал числа " + number + " равен: " + factorial);
            } catch (IllegalArgumentException e) {
                System.err.println("Ошибка: " + e.getMessage());
            }
        } else {
            System.err.println("Ошибка: Введите корректное целое число.");
        }
    }

}
