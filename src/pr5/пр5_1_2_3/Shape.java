package pr5.пр5_1_2_3;

public abstract class Shape {
    protected String color;
    protected boolean filled;

    public Shape() {};

    public Shape(String c, boolean f) {
        color = c;
        filled = f;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }
    abstract double getArea();
    abstract double getPerimeter();
    public String toString()
    {
        return "Shape: color = " + color + ", filled" + filled;
    };

}
