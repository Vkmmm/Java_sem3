package pr6.пр6_1;

public class DishTest {
    public static void main(String[] args) {
        Plate plate = new Plate("Керамика", 20);
        Cup cup = new Cup("Стекло", true);

        plate.use();
        cup.use();
    }
}
