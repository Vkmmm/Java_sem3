package pr9.pr9_1;

public class Main {
    public static void main(String[] args) {
        Nameable nameable1 = createNameable("Венера", false);
        Nameable nameable2 = createNameable("Mersedez", true);

        read(nameable1);
        read(nameable2);
    }

    static void read(Nameable nameable) {
        System.out.println("Имя объекта: " + nameable.getName());
    }

    static Nameable createNameable(String name, boolean isCar) {
        if (isCar) {
            return new Car(name);
        } else {
            return new Planet(name);
        }
    }
}
