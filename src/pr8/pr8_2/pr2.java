package pr8.pr8_2;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class pr2 extends JScrollPane {
    private BufferedImage image;

    // Конструктор класса pr2, который загружает изображение из файла и отображает его в окне
    public pr2(String imagePath) {
        try {
            image = ImageIO.read(new File(imagePath)); // Загрузка изображения из файла

            // Создание панели для отображения изображения
            JPanel imagePanel = new JPanel() {
                @Override
                protected void paintComponent(Graphics g) {
                    super.paintComponent(g);
                    g.drawImage(image, 0, 0, this);
                }
            };

            imagePanel.setPreferredSize(new Dimension(image.getWidth(), image.getHeight())); // Установка размеров панели
            setViewportView(imagePanel); // Установка панели в качестве содержимого прокручиваемого окна

        } catch (IOException e) {
            e.printStackTrace(); // Вывод ошибки, если не удалось загрузить изображение
        }
    }

    public static void main(String[] args) {
        if (args.length != 1) {
            System.err.println("Укажите путь к изображению в аргументах командной строки.");
            System.exit(1); // Завершение программы с кодом ошибки, если не указан путь к изображению
        }

        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame(); // Создание главного окна
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Установка операции при закрытии окна
            frame.setSize(680, 500); // Установка размеров окна
            frame.add(new pr2(args[0])); // Добавление панели с изображением в окно
            frame.setVisible(true); // Отображение окна
        });
    }
}
