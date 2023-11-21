package pr24;


public final class Drink implements Item {
    private static final double DEFAULT_COST = 0.0;
    private static final String DEFAULT_NAME = "Unknown";
    private static final String DEFAULT_DESCRIPTION = "";

    private final double cost;
    private final String name;
    private final String description;

    public Drink(String name, String description) {
        cost = 0;
        this.name = name;
        this.description = description;
    }
    public Drink(double cost, String name, String description) {
        if (cost < 0)
            throw new IllegalArgumentException("Cost is below zero");
        this.cost = cost;
        this.name = name;
        this.description = description;
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
