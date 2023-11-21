package pr2;
import java.util.Random;

public class ex4 {
    public static int[] generate(int l, int min, int max)
    {
        Random random = new Random();
        int[] array = new int[l];

        for (int i = 0; i < l; i++) {
            array[i] = random.nextInt(max - min + 1) + min; // Генерация случайного числа в диапазоне [min, max]
        }

        return array;
    }
    public static void printArray(int[] array) {
        System.out.print("Сгенерированный массив: [");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
    public static void sort(int[] array, int l)
    {
        for (int i = 0; i< l; i++)
            for (int j = i; j < l; j++)
                if (array[j] < array[i]) {
                    int t;
                    t = array[j];
                    array[j] = array[i];
                    array[i] = t;
                }
    }
    public static void main(String[] args) {
        int[] randomArray = generate(10, 1, 100); // Генерация массива из 10 случайных чисел от 1 до 100
        printArray(randomArray);

        sort(randomArray, randomArray.length);

        System.out.println("Отсортированный массив:");
        printArray(randomArray);

    }
}
