import java.awt.Color;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;
import java.awt.Graphics2D;
/**
 * Write a description of class Square here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Square extends DrawingShape
{
    /**
     * Constructor for objects of class Square
     */
    public Square(Point2D.Double center, double radius, Color color)
    {
        super(center, radius, color);
    }
    
    @Override
    public boolean isInside(Point2D.Double point)
    {
        if((point.getX()<(getCenter().getX() + getRadius()))&&(point.getX()>(getCenter().getX() - getRadius())) &&
        (point.getY()<(getCenter().getY() + getRadius()))&&(point.getY()>(getCenter().getY() - getRadius())))
        {
            return true;
        }
        return false;
    }
    public void draw(Graphics2D g2, boolean filled)
    {
        g2.setPaint(getColor());
        Rectangle2D.Double square = new Rectangle2D.Double(getCenter().getX() - getRadius(),
        getCenter().getY() - getRadius(), getRadius()*2,getRadius()*2);
        g2.draw(square);
        if(filled == true)
        {
            g2.fill(square);
        }
    }
}
