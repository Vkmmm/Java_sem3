package pr13;
import java.io.*;
import java.util.Scanner;
public class pr13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Запись в файл
        try {
            System.out.println("Введите информацию для записи в файл:");
            String input = scanner.nextLine();
            writeToFile("data.txt", input);
        } catch (IOException e) {
            e.printStackTrace();
        }
        // Вывод файла
        try {
            System.out.println("Содержимое файла:");
            String content = readFromFile("data.txt");
            System.out.println(content);
        } catch (IOException e) {
            e.printStackTrace();
        }
        // Замена информации в файле
        try {
            System.out.println("Введите новую информацию для записи в файл:");
            String newContent = scanner.nextLine();
            writeToFile("data.txt", newContent);
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Добавление текста в конец файла
        try {
            System.out.println("Введите текст для добавления в конец файла:");
            String appendedText = scanner.nextLine();
            appendToFile("data.txt", appendedText);
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Вывод файла 
        try {
            System.out.println("Содержимое файла:");
            String content = readFromFile("data.txt");
            System.out.println(content);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Метод для записи информации в файл
    public static void writeToFile(String fileName, String content) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            writer.write(content);
        }
    }

    // Метод для чтения информации из файла
    public static String readFromFile(String fileName) throws IOException {
        StringBuilder content = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                content.append(line).append('\n');
            }
        }
        return content.toString();
    }

    // Метод для добавления текста в конец файла
    public static void appendToFile(String fileName, String text) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true))) {
            writer.write(text);
        }
    }
}