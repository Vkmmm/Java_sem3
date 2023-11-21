package pr23.ex2_3;

import java.util.ArrayList;
import java.util.List;
import java.util.Comparator;
public class Order {
    private List<Item> items;

    public Order() {
        this.items = new ArrayList<>();
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public void removeItem(Item item) {
        items.remove(item);
    }
    public int removeAll(String dishName) {
        int count = 0;
        int size = items.size();
        for (int i = 0; i < size; i++) {
            if (items.get(i).getName() == dishName) {
                items.remove(i);
                count++;
            }
        }
        return count;
    }
    public List<Item> getItems() {
        return items;
    }
    public int dishQuantity(String dishName) {
        int quantity = 0;
        for (Item item : items) {
            if (item.getName() == dishName)
                quantity++;
        }
        return quantity;
    }
    public String[] dishesNames() {
        int size = items.size();
        String[] results = new String[size];
        for (int i = 0; i < size; i++) {
            results[i] = items.get(i).getName();
        }
        return results;
    }
    public Item[] sortedItemsByCostDesc() {
        items.sort(new Comparator<Item>() {
            @Override
            public int compare(Item o1, Item o2) {
                if (o1.getCost() < o2.getCost())
                    return 1;
                else if (o1.getCost() < o2.getCost())
                    return -1;
                else
                    return 0;
            }
        });
        return null;
    }
    public double calculateTotalCost() {
        double totalCost = 0.0;
        for (Item item : items) {
            totalCost += item.getCost();
        }
        return totalCost;
    }
}
