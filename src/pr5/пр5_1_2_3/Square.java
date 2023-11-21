package pr5.пр5_1_2_3;

public class Square extends Rectangle {
    public Square() {
        this.filled = false;
        this.color = "white";
        this.setWidth(1);
    }
    public Square(double side) {
        this.filled = false;
        this.color = "white";
        this.setWidth(side);
    }
    public Square(double side, String color, boolean filled) {
        this.color = color;
        this.setWidth(side);
        this.setLength(side);
        this.filled = filled;
    }
    public double getSide() {
        return getWidth();
    }
    public void setSide(double side) {
        setWidth(side);
        setLength(side);
    }
    @Override
    public void setWidth(double side) {
        super.setWidth(side);
        super.setLength(side);
    }
    @Override
    public void setLength(double side) {
        super.setWidth(side);
        super.setLength(side);
    }
    @Override
    public String toString() {
        return "Shape: square, side: "+this.getWidth()+", color: "+this.color;
    }

}
