package pr14;
import java.util.Collection;
public class BoundedWaitList <E> extends WaitList<E> {

    private int capacity; // Поле для хранения максимальной емкости очереди


    public BoundedWaitList(int capacity){ // Конструктор класса, принимающий максимальную емкость
        super(); // Вызов конструктора суперкласса
        if(capacity <= 0) throw new IllegalArgumentException("Максимальный размер должен быть больше 0! Получено значение: " + capacity);
        this.capacity = capacity;
    }


    public BoundedWaitList(Collection<E> col){ // Конструктор класса, принимающий коллекцию элементов и устанавливающий емкость по размеру коллекции
        super(col);
        this.capacity = col.size();
    }


    public int getCapacity() {
        return capacity;
    }


    @Override // Метод добавления элемента в очередь, с учетом максимальной емкости
    public void add(E element) {
        if(components.size() == capacity) throw new IllegalStateException("Очередь заполнена!");
        components.add(element);
    }

    @Override
    public String toString() {
        return "BoundedWaitList{" +
                "capacity=" + capacity +
                ", components=" + components +
                '}';
    }
}