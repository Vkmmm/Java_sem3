package pr4.пр4_3;

public class TestBook {
    public static void main(String[] args) {
        Book book = new Book("А. С. Пушкин", "Евгений Онегин", 1830);

        System.out.println("Информация о книге:");
        System.out.println(book);

        // Update book details
        book.setAuthor("Ф. М. Достаевский");
        book.setTitle("Преступление и наказание");
        book.setYear(1866);

        System.out.println("\nОбновленные данные:");
        System.out.println(book);
    }
}
