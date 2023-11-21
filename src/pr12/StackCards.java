package pr12;
import java.util.*;

public class StackCards {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        // Чтение ввода первой строки
        String c1 = in.next();
        String c2 = in.next();

        int turn = 0;// Счетчик ходов

        // Стеки карт
        Stack<Integer> Cards1 = new Stack<>();
        Stack<Integer> Cards2 = new Stack<>();

        // Заполнение стеков карт из вводных строк
        for (int i = 0; i < c1.length(); i++) {
            Cards1.push(Integer.parseInt(Character.toString(c1.charAt(i))));
        }
        for (int i = 0; i < c2.length(); i++) {
            Cards2.push(Integer.parseInt(Character.toString(c2.charAt(i))));
        }

        // Стеки "побочных" карт
        Stack<Integer> CardsStack1 = new Stack<>();
        Stack<Integer> CardsStack2 = new Stack<>();

        while (true) {
            // Если количество ходов достигло 106, объявить "ботву" и завершить игру
            if (turn >= 106) {
                System.out.println("botva");
                break;
            }

            // Если карты первого игрока закончились и стек первого игрока пуст, второй игрок побеждает
            if (Cards1.isEmpty()) {
                if (CardsStack1.isEmpty()) {
                    System.out.println("second " + turn);
                    break;
                }
                // Перераспределение карт из стека "побочных" карт в стек карт первого игрока
                while (!CardsStack1.isEmpty()) {
                    Cards1.push(CardsStack1.pop());
                }
            }

            if (Cards2.isEmpty()) {
                if (CardsStack2.isEmpty()) {
                    System.out.println("first " + turn);
                    break;
                }
                while (!CardsStack2.isEmpty()) {
                    Cards2.push(CardsStack2.pop());
                }
            }

            turn++;

            // Определение победителя текущего хода и перераспределение карт в соответствии с правилами игры
            if ((Cards1.peek() == 0) && (Cards2.peek() == 9)) {
                CardsStack1.push(Cards1.pop());
                CardsStack1.push(Cards2.pop());
            }
            else if ((Cards1.peek() == 9) && (Cards2.peek() == 0)) {
                CardsStack2.push(Cards2.pop());
                CardsStack2.push(Cards1.pop());
            }
            else if (Cards1.peek() > Cards2.peek()) {
                CardsStack1.push(Cards1.pop());
                CardsStack1.push(Cards2.pop());
            }
            else {
                CardsStack2.push(Cards2.pop());
                CardsStack2.push(Cards1.pop());
            }
        }
    }
}

