package pr23.ex2_3;


import java.util.ArrayList;
public class TablesOrderManager {
    private Order[] orders;

    public TablesOrderManager(int tableNumber) {
        this.orders = new Order[tableNumber];
    }
    public TablesOrderManager(Order[] orders) {
        this.orders = orders;
    }
    public void add(Order order, int tableNumber) {
        orders[tableNumber] = order;
    }
    public Order getOrder(int tableNumber) {
        return orders[tableNumber];
    }
    public void addDish(Dish dish, int tableNumber) {
        orders[tableNumber].addItem(dish);
    }
    public void removeOrder(int tableNumber) {
        orders[tableNumber] = null;
    }
    public int freeTableNumber() {
        int count = 0;
        for (Order order : orders)
            if (order == null)
                count++;
        return count;
    }
    public ArrayList<Integer> freeTableNumbers() {
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < orders.length; i++)
            if (orders[i] == null)
                numbers.add(i);
        return numbers;
    }

    public Order[] getOrders() {
        return orders;
    }
    public double ordersCostSummary() {
        double result = 0.0;
        for (Order order : orders) {
            if (order != null)
                result += order.calculateTotalCost();
        }
        return result;
    }
    public int dishQuantity(String dishname) {
        int count = 0;
        int size = orders.length;
        for (int i = 0; i < size; i++)
            if (orders[i] != null)
                for (Item dish : orders[i].getItems())
                    if (dish.getName() == dishname)
                        count++;
        return count;
    }
}
