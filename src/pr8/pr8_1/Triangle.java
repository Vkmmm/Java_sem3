package pr8.pr8_1;

import java.awt.Color;
import java.awt.Graphics;

public class Triangle extends Shape {
    private int[] xPoints;
    private int[] yPoints;

    public Triangle(Color color, int[] xPoints, int[] yPoints) {
        super(color, 0, 0); // Позиция треугольника не используется
        this.xPoints = xPoints;
        this.yPoints = yPoints;
    }

    @Override
    public void draw(Graphics g) {
        g.setColor(color);
        g.fillPolygon(xPoints, yPoints, 3);
    }
}