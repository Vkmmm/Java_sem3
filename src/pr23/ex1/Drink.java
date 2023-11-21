package pr23.ex1;

public final class Drink {
    private static final double DEFAULT_COST = 0.0;
    private static final String DEFAULT_NAME = "Unknown";
    private static final String DEFAULT_DESCRIPTION = "";

    private final double cost;
    private final String name;
    private final String description;

    public Drink(String name, String description) {
        this(DEFAULT_COST, name, description);
    }

    public Drink(double cost, String name, String description) {
        this.cost = cost;
        this.name = name != null ? name : DEFAULT_NAME;
        this.description = description != null ? description : DEFAULT_DESCRIPTION;
    }

    public double getCost() {
        return cost;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public static void main(String[] args) {

        Drink drink1 = new Drink("Добрый Кола", "Очень вкусная газировка!");
        Drink drink2 = new Drink(125, "Ананасовый сок", "Свежевыжатый ананасовый сок");

        System.out.println("Напиток 1: " + drink1.getName() + ", Стоимость: " + drink1.getCost() + " руб., Описание: " + drink1.getDescription());
        System.out.println("Напиток 2: " + drink2.getName() + ", Стоимость: " + drink2.getCost() + " руб., Описание: " + drink2.getDescription());
    }
}
