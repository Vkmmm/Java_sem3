package pr16;

public class ex5 {
    public void getDetails(String key) {
        try {
            if (key == null) {
                throw new NullPointerException("null key in getDetails");
            }
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException inside getDetails: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        ex5 demo = new ex5();
        demo.getDetails(null); // Вызываем метод с null параметром
}}
