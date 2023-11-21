package pr1.пр1_2;


public class TestBall {
    public static void main(String[] args) {
        Ball b1 = new Ball("Green", 9);
        Ball b2 = new Ball("Blue", 12);
        Ball b3 = new Ball("White");
        b3.setDiameter(8);
        System.out.println(b1);
        b1.print();
        b2.print();
        b3.print();
    }
}
