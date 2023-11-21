package pr10;

import java.util.Scanner;

public class ex16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите последовательность чисел, завершающуюся 0:");

        int[] numbers = new int[1000];
        int count = 0;

        while (true) {
            int num = scanner.nextInt();
            if (num == 0) {
                break;
            }
            numbers[count] = num;
            count++;
        }

        if (count == 0) {
            System.out.println("Последовательность не содержит ни одного числа.");
        } else {
            int maxElement = findMaxElement(numbers, count, 0, numbers[0], 1);
            int maxCount = countMaxElements(numbers, count, 0, maxElement);

            System.out.println("Наибольший элемент: " + maxElement);
            System.out.println("Количество элементов, равных наибольшему: " + maxCount);
        }
    }
    public static int findMaxElement(int[] numbers, int count, int index, int max, int maxCount) {
        if (index < count) {
            if (numbers[index] > max) {
                max = numbers[index];
                maxCount = 1;
            } else if (numbers[index] == max) {
                maxCount++;
            }
            return findMaxElement(numbers, count, index + 1, max, maxCount);
        }
        return max;
    }
    public static int countMaxElements(int[] numbers, int count, int index, int maxElement) {
        if (index < count) {
            return (numbers[index] == maxElement ? 1 : 0) + countMaxElements(numbers, count, index + 1, maxElement);
        }
        return 0;
    }
}
