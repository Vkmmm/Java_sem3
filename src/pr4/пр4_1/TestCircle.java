package pr4.пр4_1;

public class TestCircle {
    public static void main(String[] args) {
        Circle circle = new Circle(5.0);
        System.out.println("Радиус окружности: " + circle.getRadius());
        System.out.println("Площадь окружности: " + circle.calculateArea());
        System.out.println("Длина окружности: " + circle.calculateCircumference());
        circle.setRadius(7.0);
        System.out.println("\nУстановлен новый радиус: " + circle.getRadius());
        System.out.println("Новая площадь: " + circle.calculateArea());
        System.out.println("Новая длина: " + circle.calculateCircumference());
    }
}
