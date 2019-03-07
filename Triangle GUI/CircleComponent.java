import javax.swing.JOptionPane;
import java.awt.geom.Ellipse2D;
/**
 * Write a description of class CircleComponent here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CircleComponent
{
    private Ellipse2D.Double circle;
    /**
     * Constructor for objects of class CircleComponent
     */
    public CircleComponent(int xCd, int yCd, int radius)
    {
        circle = new Ellipse2D.Double(xCd, yCd, radius, radius);
    }

}
