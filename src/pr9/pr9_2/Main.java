package pr9.pr9_2;

public class Main {
    public static void main(String[] args) {
        Priceable priceable1 = createPriceable("Ipone 15 Pro Max", 200000.0, false);
        Priceable priceable2 = createPriceable("Ремонтные работы", 1500.0, true);

        read(priceable1);
        read(priceable2);
    }

    static void read(Priceable priceable) {
        System.out.println("Цена " + priceable);
    }

    static Priceable createPriceable(String name, double pricePerHour, boolean isService) {
        if (isService) {
            return new Service(name, pricePerHour);
        } else {
            return new Product(name, pricePerHour);
        }
    }
}
