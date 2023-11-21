package pr23.ex2_3;

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

        orderManager.add(orders[3], 9);
        orderManager.add(orders[5], 7);
        orderManager.removeOrder(9);
        orderManager.add(orders[1], 3);

        System.out.println("Общая стоимость заказов: " + orderManager.ordersCostSummary());
        System.out.println("Количество свободных столов: " + orderManager.freeTableNumbers());
        System.out.println("Номер свободного стола: " + orderManager.freeTableNumber());
    }
}
