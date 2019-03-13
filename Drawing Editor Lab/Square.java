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
    private Point2D.Double cent;
    private double rad;
    private Color col;
    private double x;
    private double y;
    private double width;
    /**
     * Constructor for objects of class Square
     */
    public Square(Point2D.Double center, double radius, Color color)
    {
        super(center, radius, color);
        this.x = center.getX() - radius;
        this.y = center.getY() - radius;
        this.width = radius * 2;
    }
    
    @Override
    public boolean isInside(Point2D.Double point)
    {
        if((point.getX()<(cent.getX() + rad))&&(point.getX()>(cent.getX() - rad)) &&
        (point.getY()<(cent.getY() + rad))&&(point.getY()>(cent.getY() - rad)))
        {
            return true;
        }
        return false;
    }
    public void draw(Graphics2D g2, boolean filled)
    {
        g2.draw(new Rectangle2D.Double(x, y, width, width));
    }
}
