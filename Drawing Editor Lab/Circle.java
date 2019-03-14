import java.awt.Color;
import java.awt.geom.Point2D;
import java.awt.Graphics2D;
/**
 * Write a description of class Circle here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Circle extends DrawingShape
{
    /**
     * Constructor for objects of class Circle
     */
    public Circle(Point2D.Double center, double radius, Color color)
    {
        super(center, radius, color);
    }

    @Override
    public boolean isInside(Point2D.Double point)
    {
        // if((point.getX()<(cent.getX() + rad))&&(point.getX()>(cent.getX() - rad)) &&
        // (point.getY()<(cent.getY() + rad))&&(point.getY()>(cent.getY() - rad)))
        // {
            // return true;
        // }
        return false;
    }
    public void draw(Graphics2D g2, boolean filled)
    {
    }
}
