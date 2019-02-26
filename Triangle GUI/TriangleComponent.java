import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class TriangleComponent extends JComponent
{
    private static final int MAX_POINTS = 3;
    private int clicks;
    
    public TriangleComponent()
    {
        MouseListener listener = new MouseClickListener();
        this.clicks = 0;
        this.addMouseListener(listener);
        this.addMouseListener(listener);
    }

    @Override
    public void paintComponent(Graphics g)
    {  
        super.paintComponent( g );
        Graphics2D g2 = (Graphics2D) g;
        
    }
    public class MouseClickListener implements MouseListener
    {
        public void mouseClicked( MouseEvent event )
        {
            System.out.println("Mouse has been clicked");
            System.out.println("(" + event.getX() + ", " + event.getY() + ")");
            clicks++;
            System.out.println(clicks);
        }

        public void mouseEntered( MouseEvent event )
        {
        }

        public void mouseExited( MouseEvent event )
        {
        }

        public void mousePressed( MouseEvent event )
        {
        }

        public void mouseReleased( MouseEvent event )
        {
        }
    }

    
}