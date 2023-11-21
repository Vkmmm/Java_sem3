package pr1.пр1_3;

public class TestBook {
    public static void main(String[] args) {
        Book b1 = new Book("Pushkin", 99);
        Book b2 = new Book("Dostoevsky", 112);
        Book b3 = new Book("Lermontov"); b3.setPages(200);
        System.out.println(b1);
        b1.print();
        b2.print();
        b3.print();
    }
}
