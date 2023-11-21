package pr8.pr8_1;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomShapesWindow extends JFrame {
    private List<pr8.pr8_1.Shape> shapes;

    // Конструктор класса RandomShapesWindow
    private RandomShapesWindow() {
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE); // Установка операции при закрытии окна
        setSize(500, 500); // Установка размера окна
        setLocationRelativeTo(null); // Установка положения окна по центру экрана
        shapes = generateRandomShapes(20); // Генерация случайных фигур
        setVisible(true); // Устанавливает окно видимым
    }

    // Переопределение метода paint для рисования фигур
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        for (pr8.pr8_1.Shape shape : shapes) {
            shape.draw(g); // Вызов метода draw для отрисовки каждой фигуры
        }
    }

    // Генерация случайных фигур
    private List<pr8.pr8_1.Shape> generateRandomShapes(int count) {
        List<Shape> randomShapes = new ArrayList<>();
        Random rand = new Random();

        for (int i = 0; i < count; i++) {
            int shapeType = rand.nextInt(3); // Генерация случайного типа фигуры (0 - круг, 1 - прямоугольник, 2 - треугольник)
            Color randomColor = new Color(rand.nextInt(256), rand.nextInt(256), rand.nextInt(256)); // Генерация случайного цвета
            int x = rand.nextInt(getWidth() - 50); // Генерация случайной x-координаты
            int y = rand.nextInt(getHeight() - 50); // Генерация случайной y-координаты

            // В зависимости от типа фигуры создаем соответствующий объект и добавляем его в список
            switch (shapeType) {
                case 0:
                    int radius = rand.nextInt(50) + 10; // Генерация случайного радиуса для круга
                    randomShapes.add(new Circle(randomColor, x, y, radius));
                    break;
                case 1:
                    int width = rand.nextInt(80) + 20; // Генерация случайной ширины прямоугольника
                    int height = rand.nextInt(80) + 20; // Генерация случайной высоты прямоугольника
                    randomShapes.add(new Rectangle(randomColor, x, y, width, height));
                    break;
                case 2:
                    int[] xPoints = {x, x + rand.nextInt(50), x - rand.nextInt(50)}; // Генерация координат x для вершин треугольника
                    int[] yPoints = {y, y + rand.nextInt(50), y + rand.nextInt(50)}; // Генерация координат y для вершин треугольника
                    randomShapes.add(new Triangle(randomColor, xPoints, yPoints));
                    break;
            }
        }

        return randomShapes; // Возвращает список случайных фигур
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new RandomShapesWindow()); // Создание и отображение окна
    }
}