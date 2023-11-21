package pr6.пр6_1;

abstract class Dish {
    private String material;

    public Dish(String material) {
        this.material = material;
    }

    public String getMaterial() {
        return material;
    }

    public abstract void use();
}


class Plate extends Dish {
    private int diameter;

    public Plate(String material, int diameter) {
        super(material);
        this.diameter = diameter;
    }

    @Override
    public void use() {
        System.out.println("Используем тарелку диаметром " + diameter + " см.");
    }
}

class Cup extends Dish {
    private boolean handle;

    public Cup(String material, boolean handle) {
        super(material);
        this.handle = handle;
    }

    @Override
    public void use() {
        if (handle) {
            System.out.println("Используем чашку с ручкой.");
        } else {
            System.out.println("Используем чашку без ручки.");
        }
    }
}



