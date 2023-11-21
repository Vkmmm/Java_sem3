package pr5.пр5_4;

public class TestMovable {
    public static void main(String[] args) {
        Movable m = new MovablePoint(0, 0, 1, 1);
        System.out.println("Point:");
        System.out.println(m);
        m.moveDown();
        m.moveRight();
        System.out.println("Down and Right: " + m);
        System.out.println("Circle:");
        m = new MovableCircle(0, 0, 1, 1, 1);
        System.out.println(m);
        m.moveUp();
        m.moveLeft();
        System.out.println("Up and Left: " + m);

        System.out.println("Rectangle:");
        m = new MovableRectangle(0, 0, 1, 1, 1,1);
        System.out.println(m);
        m.moveLeft();
        m.moveDown();
        System.out.println("Left and Down: " + m);

        System.out.println("Changing speed for rectangle:");
        MovableRectangle r = (MovableRectangle)m;
        r.setSpeed(1, 0);
        try{
            r.moveDown();
        }catch (IllegalStateException e){
            System.out.println(e);
        }
    }
}
