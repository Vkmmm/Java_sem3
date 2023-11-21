package pr24;

import pr23.ex2_3.Dish;
import pr23.ex2_3.Drink;
import pr23.ex2_3.Order;
import pr23.ex2_3.TablesOrderManager;

public class Test {
    public static void main(String[] args) {
        TablesOrderManager orderManager = new TablesOrderManager(10);
        Order[] orders = new Order[10];

        for (int i = 0; i < orders.length; i++)
            orders[i] = new Order();

        orders[3].addItem(new Dish(287, "Спагетти", "Очень вкусное блюдо!"));
        orders[3].addItem(new Dish(30, "Чай", "Прекрасный травяной чай."));

        orders[5].addItem(new Dish(150, "Стейк", "Нежный и сочный стейк"));
        orders[5].addItem(new Drink(50, "Кола", "Освежающий газированный напиток"));

        orders[1].addItem(new Dish(120, "Пицца", "Итальянская пицца с разнообразными начинками"));

        // Добавляем заказ на стол 9
        orderManager.add(orders[3], 9);

        // Добавляем заказ на стол 7
        orderManager.add(orders[5], 7);

        // Удаляем заказ со стола 9
        orderManager.removeOrder(9);

        // Попытка удалить заказ с уже освобожденного стола 9
        orderManager.removeOrder(9);
        try {
            orderManager.removeOrder(9);
        } catch (IllegalTableNumber e) {
            System.out.println("Произошла ошибка: " + e.getMessage());
        }
        orderManager.add(orders[1], 3);

        System.out.println("Общая стоимость заказов: " + orderManager.ordersCostSummary());
        System.out.println("Количество свободных столов: " + orderManager.freeTableNumbers());
        System.out.println("Номер свободного стола: " + orderManager.freeTableNumber());
    }

}