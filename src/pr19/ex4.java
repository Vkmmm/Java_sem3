package pr19;

import java.util.ArrayList;
import java.util.List;

public class ex4 {
    public static List<String> createSampleList() {
        List<String> elementList = new ArrayList<>();
        elementList.add("Арбуз");
        elementList.add("Гусь");
        elementList.add("Птичка");
        elementList.add("Боб");
        elementList.add("Карнавал");
        elementList.add("Тоска");
        elementList.add("Дела");
        elementList.add("Бутылка");
        return elementList;
    }

    public static void main(String[] args) {
        List<String> sampleList = createSampleList();

        System.out.println("Первые 5 элементов в списке:");
        for (int i = 0; i < Math.min(5, sampleList.size()); i++) {
            System.out.println(sampleList.get(i));
        }
    }
}
