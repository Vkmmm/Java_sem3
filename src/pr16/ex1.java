package pr16;

public class ex1 {
    public void exceptionDemo() {
        System.out.println(2.0 / 0.0);
    }

    public static void main(String[] args) {
        ex1 demo = new ex1();
        demo.exceptionDemo();
    }
}

