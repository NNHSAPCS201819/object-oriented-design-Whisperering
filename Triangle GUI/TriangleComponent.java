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
    private int x;
    private int y;
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
            Ellipse2D.Double point = new Ellipse2D.Double(x - 15,
                    y - 15, 30, 30);
            g2.draw(point);
        }
        else if(clicks == 2)
        {
            Ellipse2D.Double point2 = new Ellipse2D.Double(x - 15,
                    y - 15, 30, 30);
            g2.draw(point2);
        }
        else if(clicks == 3)
        {
        }
        else
        {
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
        }

        public void mouseEntered( MouseEvent event ){}

        public void mouseExited( MouseEvent event ){}

        public void mousePressed( MouseEvent event ){}

        public void mouseReleased( MouseEvent event ){}
    }

}