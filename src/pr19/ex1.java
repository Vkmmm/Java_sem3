package pr19;
import java.util.ArrayList;
import java.util.List;
public class ex1 {
    public static List<String> convertStringArrayToList(String[] array) {
        List<String> list = new ArrayList<>();
        for (String element : array) {
            list.add(element);
        }
        return list;
    }

    public static List<Integer> convertIntArrayToList(int[] array) {
        List<Integer> list = new ArrayList<>();
        for (int element : array) {
            list.add(element);
        }
        return list;
    }

    public static void main(String[] args) {
        // Пример конвертации массива строк в список
        String[] stringArray = {"aaa", "bbb", "ccc"};
        List<String> stringList = convertStringArrayToList(stringArray);
        System.out.println("Список строк: " + stringList);

        // Пример конвертации массива чисел в список
        int[] intArray = {1, 2, 3, 4, 5};
        List<Integer> intList = convertIntArrayToList(intArray);
        System.out.println("Список чисел: " + intList);
    }
}
