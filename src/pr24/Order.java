package pr24;
import java.util.List;
public interface Order {
    public boolean addItem(Item dish);
    public boolean removeItem(String dishName);
    public int removeAll(String itemName);
    public List<Item> getItems();
    public double costTotal();
    public int itemQuantity(String itemName);
    public String[] itemsNames();
    public List<Item> sortedItemsByCostDesc();
}
