package pr14;
import java.util.ArrayList;
public class main {
    public static void main(String[] args) {
    // Пример использования класса WaitList
    ArrayList<String> al = new ArrayList<>();
    al.add("Java");
    al.add("Programming");
    WaitList<String> wl = new WaitList<>();
    wl.add("Hello");
    wl.add("Java");
    wl.add("World");
    System.out.println(wl);
    System.out.println(wl.remove());
    System.out.println(wl);
    System.out.println(wl.isEmpty());
    System.out.println(wl.contains("Hello"));
    System.out.println(wl.containsAll(al));
    System.out.println();
    // Пример использования класса BoundedWaitList
    BoundedWaitList<String> bwl = new BoundedWaitList<>(3);
    bwl.add("One");
    bwl.add("Two");
    bwl.add("Three");
    System.out.println(bwl);
    try {
        bwl.add("Four");
    } catch (Exception e) {
        e.printStackTrace();
    }
    System.out.println();
    System.out.println(bwl);
    System.out.println(bwl.getCapacity());

    System.out.println();
    bwl = new BoundedWaitList<String>(al);
    System.out.println(bwl.getCapacity());
    try {
        bwl.add("Four");
    } catch (Exception e) {
        e.printStackTrace();
    }
    System.out.println();
    // Пример использования класса UnfairWaitList
    UnfairWaitList<Integer> uwl = new UnfairWaitList<>();
    uwl.add(1);
    uwl.add(2);
    uwl.add(3);
    uwl.add(4);
    uwl.add(4);
    uwl.add(5);
    System.out.println(uwl);
    uwl.remove(4);
    System.out.println(uwl);
    uwl.moveToBack(3);
    System.out.println(uwl);
    }
}
