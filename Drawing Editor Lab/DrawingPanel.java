import javax.swing.JColorChooser;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Point2D.Double;
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
    private DrawingShape selected;
    /**
     * Default constructor for objects of class DrawingPanel
     */
    public DrawingPanel()
    {
        this.setBackground(Color.white);
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
    //Allows one to change the color of te next shape by choosing
    // desired color from the colo panel
    public void pickColor()
    {
        Color selectedColor = JColorChooser.showDialog( this, "select the fill color", this.fillColor );
        if( selectedColor != null )
        {
            this.fillColor = selectedColor;
        }
    }
    // Method returns current selected color when called
    public Color getColor()
    {
        return fillColor;
    }
    // Resizes the to a better drawing panel size
    public Dimension getPreferredSize()
    {
        Dimension newSize = new Dimension(500, 500);
        return newSize;
    }
    // Adds a Circle which is a DrawignShape
    public void addCircle()
    {
        shapes.add(new Circle(new Point2D.Double(250,250), Math.random() * 99 + 1,fillColor));
        selected = shapes.get(shapes.size() - 1);
    }
    // Adds a Square which is a DrawignShape
    public void addSquare()
    {
        shapes.add(new Square(new Point2D.Double(250,250),Math.random() * 99 + 1,fillColor));
        selected = shapes.get(shapes.size() - 1);
    }
    // Paints shapes and chsck to see which shape is selected so
    // it is an outline
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        for(DrawingShape shape : shapes)
        {
            if(shape == selected)
            {
                shape.draw(g2 , false);
            }
            else
            {
                shape.draw(g2 , true);
            }
        }
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
            // Changes selected shape
            for(int i = shapes.size() -1; i >= 0; i--)
            {
                DrawingShape shape = shapes.get(i);
                if(shape.isInside(new Point2D.Double(event.getX(), event.getY())))
                {
                    selected = shape;
                    break;
                }
            }
            repaint();
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
        // Drags selected shape to a new spot
        public void mouseDragged(MouseEvent event)
        {
            selected.move(event.getX(), event.getY());
            repaint();
        }
    }
}
