package pr12;

import java.util.LinkedList;
import java.util.Scanner;

public class DoubleListCards {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String c1 = in.next();
        String c2 = in.next();
        int turn = 0; // Счетчик ходов

        LinkedList<Integer> cards1 = new LinkedList<>(); // Создание двусвязного списка для карт первого игрока
        LinkedList<Integer> cards2 = new LinkedList<>(); // Создание двусвязного списка для карт второго игрока

        // Заполнение списков карт из строк
        for (int i = 0; i < c1.length(); i++) {
            cards1.add(Integer.parseInt(Character.toString(c1.charAt(i)))); // Преобразование символа в целое число и добавление в список cards1
        }
        for (int i = 0; i < c2.length(); i++) {
            cards2.add(Integer.parseInt(Character.toString(c2.charAt(i)))); // Преобразование символа в целое число и добавление в список cards2
        }

        while (true) {
            if (turn >= 106) {
                System.out.println("botva"); // Если количество ходов превысило 106, объявляется ничья ("ботва") и игра завершается
                break;
            }
            if (cards1.isEmpty()) {
                System.out.println("second " + turn); // Если у первого игрока закончились карты, второй игрок побеждает
                break;
            }
            if (cards2.isEmpty()) {
                System.out.println("first " + turn); // Если у второго игрока закончились карты, первый игрок побеждает
                break;
            }
            turn++; // Увеличиваем счетчик ходов

            // Проверяем условия для перемещения карт между игроками
            if ((cards1.get(0) == 0) && (cards2.get(0) == 9)) {
                cards1.add(cards1.remove(0));
                cards1.add(cards2.remove(0));
            } else if ((cards1.get(0) == 9) && (cards2.get(0) == 0)) {
                cards2.add(cards2.remove(0));
                cards2.add(cards1.remove(0));
            } else if (cards1.get(0) > cards2.get(0)) {
                cards1.add(cards1.remove(0));
                cards1.add(cards2.remove(0));
            } else {
                cards2.add(cards2.remove(0));
                cards2.add(cards1.remove(0));
            }
        }
    }
}

