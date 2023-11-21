package pr5.пр5_4;

public class MovableRectangle implements Movable {
    MovablePoint topLeft;
    MovablePoint bottomRight;
    public MovableRectangle (int x1, int y1, int x2, int y2, int xSpeed, int ySpeed)
    {
        topLeft = new MovablePoint(x1, y1, xSpeed, ySpeed);
        bottomRight = new MovablePoint(x2, y2, xSpeed, ySpeed);
    }
    public void setSpeed(int xSpeed, int ySpeed){
        topLeft.ySpeed = ySpeed;
        topLeft.xSpeed = xSpeed;
    }

    private boolean ESpeed(){
        return topLeft.xSpeed == bottomRight.xSpeed && topLeft.ySpeed == bottomRight.ySpeed;
    }
    @Override
    public String toString() {
        return "MovableRectangle: topLeft=MovablePoint: x=" + topLeft.x + ", y="+ topLeft.y+ ", bottomRight=MovablePoint: x=" + bottomRight.x + ", y=" + bottomRight.y +
                ", xSpeed = " + topLeft.xSpeed + ", ySpeed=" + topLeft.ySpeed;
    }
    @Override
    public void moveUp()
    {
        if (!ESpeed()) throw new IllegalStateException("Скорости точек не совпадают!");
        topLeft.moveUp();
        bottomRight.moveUp();
    }
    @Override
    public void moveDown()
    {
        if (!ESpeed()) throw new IllegalStateException("Скорости точек не совпадают!");
        topLeft.moveDown();
        bottomRight.moveDown();
    }
    @Override
    public void moveLeft()
    {
        if (!ESpeed()) throw new IllegalStateException("Скорости точек не совпадают!");
        topLeft.moveLeft();
        bottomRight.moveLeft();
    }
    @Override
    public void moveRight()
    {
        if (!ESpeed()) throw new IllegalStateException("Скорости точек не совпадают!");
        topLeft.moveRight();
        bottomRight.moveRight();
    }
}
