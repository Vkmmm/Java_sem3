package pr6.пр6_3;


abstract class Furniture {
    private String type;

    public Furniture(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public abstract void displayInfo();
}

class Chair extends Furniture {
    public Chair() {
        super("Стул");
    }

    @Override
    public void displayInfo() {
        System.out.println("Это стул.");
    }
}

class Wardrobe extends Furniture {
    public Wardrobe() {
        super("Шкаф");
    }

    @Override
    public void displayInfo() {
        System.out.println("Это шкаф.");
    }
}

class FurnitureShop {
    public void displayFurniture(Furniture furniture) {
        furniture.displayInfo();
    }
}



