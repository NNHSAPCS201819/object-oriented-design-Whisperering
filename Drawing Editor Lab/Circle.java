import java.awt.Color;
import java.awt.geom.Point2D;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
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
        if((getCenter().distance(point.getX(), point.getY())) <
        getRadius())
        {
            return true;
        }
        return false;
    }
    public void draw(Graphics2D g2, boolean filled)
    {
        g2.setPaint(getColor());
        Ellipse2D.Double circ = new Ellipse2D.Double(getCenter().getX() - getRadius(),
        getCenter().getY() - getRadius(), getRadius()*2,getRadius()*2);
        g2.draw(circ);
        if(filled == true)
        {
            g2.fill(circ);
        }
    }
}
