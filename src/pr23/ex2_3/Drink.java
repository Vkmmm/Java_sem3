package pr23.ex2_3;

public final class Drink implements Item {
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

    @Override
    public double getCost() {
        return cost;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getDescription() {
        return description;
    }

    public String toString() {
        return "\n"+getClass()+"\nCost: " + getCost() + "\nName: " + getName() + "\nDescription: " + getDescription() + "\n";
    }
}
