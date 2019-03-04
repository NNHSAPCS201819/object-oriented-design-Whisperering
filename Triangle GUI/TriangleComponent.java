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
    private int p1x;
    private int p1y;
    private int p2x;
    private int p2y;
    private int p3x;
    private int p3y;
    public TriangleComponent()
    {
        MouseListener listener = new MouseClickListener();
        this.clicks = 0;
        this.addMouseListener(listener);
    }

    @Override
    public void paintComponent(Graphics g)
    {  
        super.paintComponent( g );
        Graphics2D g2 = (Graphics2D) g;
        if(clicks == 1)
        {
            Ellipse2D.Double point = new Ellipse2D.Double(p1x - 5,
                    p1y - 5, 10, 10);
            g2.draw(point);
        }
        else if(clicks == 2)
        {
            Ellipse2D.Double point1 = new Ellipse2D.Double(p1x - 5,
                    p1y - 5, 10, 10);
            Ellipse2D.Double point2 = new Ellipse2D.Double(p2x - 5,
                    p2y - 5, 10, 10);
            Line2D.Double line = new Line2D.Double(p1x, p1y, p2x, p2y);
            g2.draw(point1);
            g2.draw(line);
            g2.draw(point2);
        }
        else if(clicks == 3)
        {
        }
        else
        {
        }
    }
    
    public void addPoint(int x, int y)
    {
        if(clicks == 1)
        {
            p1x = x;
            p1x = y;
        }
        else if(clicks == 2)
        {
            p2x = x;
            p2x = y;
        }
        else if(clicks == 3)
        {
            p3x = x;
            p3x = y;
        }
    }
    
    public class MouseClickListener implements MouseListener
    {
        public void mouseClicked( MouseEvent event )
        {
            System.out.println("Mouse has been clicked");
            System.out.println("(" + event.getX() + ", " + event.getY() + ")");
            if(clicks < MAX_POINTS)
            {
                clicks++;
            }
            else
            {
                clicks = 0;
            }
            addPoint(event.getX(), event.getY());
            repaint();
        }

        public void mouseEntered( MouseEvent event ){}

        public void mouseExited( MouseEvent event ){}

        public void mousePressed( MouseEvent event ){}

        public void mouseReleased( MouseEvent event ){}
    }

}