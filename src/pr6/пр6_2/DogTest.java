package pr6.пр6_2;

public class DogTest {
    public static void main(String[] args) {
        Labrador labrador = new Labrador();
        Pudel pudel = new Pudel();

        System.out.println("Порода лабрадор: " + labrador.getBreed());
        labrador.bark();

        System.out.println("Порода пудель: " + pudel.getBreed());
        pudel.bark();
    }
}
