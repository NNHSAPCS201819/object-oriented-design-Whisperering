import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPanel;
import javax.swing.JFrame;
import javax.swing.JButton;
/**
 * Write a description of class CircleFrame here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CircleFrame extends JFrame
{
    private CircleComponent component;
    private JFrame frame;
    private JPanel panel;
    private JButton button;
    
    private int count;
    /**
     * Constructor for objects of class CircleFrame
     */
    public CircleFrame()
    {
        this.component = new CircleComponent();
        this.count = 0;
        
        this.frame = new JFrame();
        this.panel = new JPanel();
        
        this.button = new JButton("Draw");
        this.panel.add(this.button);
        
        this.frame.add(this.panel);
        
        ActionListener listener = new ClickListener()
        {
            public void actionPerformed(ActionEvent event)
            {
            }
        };
        
        this.frame.setSize(500, 500);
        this.frame.setTitle("Circle");
        this.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.frame.setVisible(true);
    }

    public static void main(String [] args)
    {
        JFrame frame = new CircleFrame();
    }
    
    public class ClickListener implements ActionListener
    {
        public void action(ActionEvent event)
        {
            if(event.getSource() == button)
            {
                
            }
        }
    }
}
