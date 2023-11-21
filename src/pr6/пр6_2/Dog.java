package pr6.пр6_2;

abstract class Dog {
    private String breed;

    public Dog(String breed) {
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    public abstract void bark();
}

// Подкласс "Лабрадор"
class Labrador extends Dog {
    public Labrador() {
        super("Лабрадор");
    }

    @Override
    public void bark() {
        System.out.println("Лабрадор гавкает: гав-гав!");
    }
}

class Pudel extends Dog {
    public Pudel() {
        super("Пудель");
    }

    @Override
    public void bark() {
        System.out.println("Пудель гавкает: гав!");
    }
}


