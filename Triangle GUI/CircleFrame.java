import java.awt.event.ActionListener;
import javax.swing.JFrame;
/**
 * Write a description of class CircleFrame here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CircleFrame extends JFrame
{
    private CircleComponent component;
    /**
     * Constructor for objects of class CircleFrame
     */
    public CircleFrame()
    {
        this.component = new CircleComponent();
        
        this.add(component);
        
        this.setSize(500, 500);
        this.setTitle("Triangle");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    public static void main(String [] args)
    {
        JFrame frame = new CircleFrame();
    }
}
