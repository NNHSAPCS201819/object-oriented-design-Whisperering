import java.awt.Color;
import java.awt.geom.Point2D;
import java.awt.Graphics2D;
/**
 * Write a description of class DrawingShape here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public abstract class DrawingShape
{
    private Point2D.Double cent;
    private double rad;
    private Color col;
    /**
     * Constructor for objects of class DrawingShape
     */
    public DrawingShape(Point2D.Double center, double radius, Color color)
    {
        this.cent = center;
        this.rad = radius;
        this.col = color;
    }
    public Point2D.Double getCenter()
    {
        return cent;
    }
    public double getRadius()
    {
        return rad;
    }
    public Color getColor()
    {
        return col;
    }
    public void move(double x, double y)
    {
        cent.setLocation(x, y);
    }
    public void setRadius(double r)
    {
        rad = r;
    }
    public abstract boolean isInside(Point2D.Double point);
    public abstract void draw(Graphics2D g2, boolean filled);
}
