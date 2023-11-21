package pr12;

import java.util.ArrayDeque;
import java.util.Scanner;

public class DequeueCards {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String c1 = in.next(); // Ввод первой строки карт
        String c2 = in.next(); // Ввод второй строки карт
        int turn = 0; // Счетчик ходов
        ArrayDeque<Integer> cards1 = new ArrayDeque<>(); // очередь для карт первого игрока
        ArrayDeque<Integer> cards2 = new ArrayDeque<>(); // очередь для карт второго игрока

        // Заполнение очередей карт из строк
        for (int i = 0; i < c1.length(); i++) {
            cards1.offer(Integer.parseInt(Character.toString(c1.charAt(i)))); // Преобразование символа в целое число и добавление в очередь cards1
        }
        for (int i = 0; i < c2.length(); i++) {
            cards2.offer(Integer.parseInt(Character.toString(c2.charAt(i)))); // Преобразование символа в целое число и добавление в очередь cards2
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
            if ((cards1.peek() == 0) && (cards2.peek() == 9)) {
                cards1.offer(cards1.poll());
                cards1.offer(cards2.poll());
            } else if ((cards1.peek() == 9) && (cards2.peek() == 0)) {
                cards2.offer(cards2.poll());
                cards2.offer(cards1.poll());
            } else if (cards1.peek() > cards2.peek()) {
                cards1.offer(cards1.poll());
                cards1.offer(cards2.poll());
            } else {
                cards2.offer(cards2.poll());
                cards2.offer(cards1.poll());
            }
        }
    }
}
