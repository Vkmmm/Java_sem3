package pr22.ex1;

public class Main {
    public static void main(String[] args) {
        // Создаем фабрику
        ComplexAbstractFactory factory = new ConcreteFactory();

        // Используем фабрику для создания комплексного числа
        Complex complex1 = factory.createComplex();
        System.out.println("1 комплексное число: " + complex1);

        // Используем фабрику для создания комплексного числа с параметрами
        Complex complex2 = factory.createComplex(3, 4);
        System.out.println("2 комплексное число: " + complex2);
    }
}
