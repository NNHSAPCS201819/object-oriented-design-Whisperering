import java.awt.Color;
import java.awt.geom.Point2D;
/**
 * Write a description of class DrawingShape here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class DrawingShape
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


}
