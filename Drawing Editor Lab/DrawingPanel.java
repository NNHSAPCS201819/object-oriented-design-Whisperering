import javax.swing.JColorChooser;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.geom.Point2D;
/**
 * The panel in which draws all of the shapes in the drawing editor
 * 
 * @author gcschmit
 * @version 23 June 2015
 */
public class DrawingPanel extends JPanel
{
    private Color fillColor;
    private ArrayList<DrawingShape> shapes;
    private Point2D point;
    /**
     * Default constructor for objects of class DrawingPanel
     */
    public DrawingPanel()
    {
        MouseListener listener = new MouseClickListener();
        MouseMotionListener mlistener = new MouseMovedListener();
        this.addMouseListener(listener);
        this.addMouseMotionListener(mlistener);
        shapes = new ArrayList<DrawingShape>();
    }
    
    /**
     * Invoked when the "Pick Color" button is clicked. Displays a JColorChooser and sets the
     *  selected color as the new fill color. Leaves the fill color unchanged if the user clicks
     *  "Cancel"
     *
     */
    public void pickColor()
    {
        Color selectedColor = JColorChooser.showDialog( this, "select the fill color", this.fillColor );
        
        if( selectedColor != null )
        {
            this.fillColor = selectedColor;
        }
    }

    public Color getColor()
    {
        return fillColor;
    }
    
    public Dimension getPreferredSize()
    {
        Dimension newSize = new Dimension(500, 500);
        return newSize;
    }
    
    public void addCircle()
    {
        shapes.add(new Circle(0,0,0));
    }
    
    public void addSquare()
    {
    }
    
    public void paintComponent(Graphics g)
    {
    }
    
    public class MouseClickListener implements MouseListener
    {
        public void mouseClicked(MouseEvent event)
        {
        }
        public void mouseEntered(MouseEvent event)
        {
        }
        public void mouseExited(MouseEvent event)
        {
        }
        public void mousePressed(MouseEvent event)
        {
            //
        }
        public void mouseReleased(MouseEvent event)
        {
        }
    }
    public class MouseMovedListener implements MouseMotionListener
    {
        public void mouseMoved(MouseEvent event)
        {
        }
        public void mouseDragged(MouseEvent event)
        {
            //
        }
    }
}
