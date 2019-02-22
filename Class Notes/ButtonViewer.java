import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
/**
 * This class demonstrates how to install an action listener.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ButtonViewer
{
    private final int FRAME_WIDTH = 400;
    private final int FRAME_HEIGHT = 100;
    
    private JFrame frame;
    private JPanel panel;
    private JButton button;

    /**
     * Constructor for objects of class ButtonViewer
     */
    public ButtonViewer()
    {
        //1. Define and set up teh UI components
        this.frame = new JFrame();
        this.panel = new JPanel();
        
        this.button = new JButton("click me");
        this.panel.add(this.button);
        
        this.frame.add(this.panel);
        
        //2. Create the listener object
        ClickListener listener = new ClickListener();
        
        //3. Register listener object with component tht generates events
        this.button.addActionListener(listener);
        
        this.frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
        this.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.frame.setVisible(true);
    }

    public static void main(String[] args)
    {
        ButtonViewer viewer = new ButtonViewer();
    }
}
