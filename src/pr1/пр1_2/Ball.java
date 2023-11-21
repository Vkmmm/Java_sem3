package pr1.пр1_2;

public class Ball {
    private String color;
    private int diameter;
    public Ball(String c, int d)
    {
        color = c;
        diameter = d;
    }
    public Ball (String c)
    {
        color = c;
        diameter = 0;
    }
    public Ball ()
    {
        color = "Rainbow";
        diameter = 0;
    }
    public void setDiameter (int diameter)
    {
        this.diameter = diameter;
    }
    public void setColor (String color)
    {
        this.color = color;
    }
    public String getColor (String color)
    {
        return color;
    }
    public int getDiameter (int Diameter)
    {
        return Diameter;
    }
    public String toString ()
    {
        return this.color + ", diameter " + this.diameter;
    }
    public void print ()
    {
        System.out.println("Color of the ball is " + color + ", the radius is " + diameter / 2.0);
    }


}
