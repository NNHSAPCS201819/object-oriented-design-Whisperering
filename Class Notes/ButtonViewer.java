import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;
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
    private JButton buttonA;
    private JButton buttonB;
    private JLabel label;

    private int clickCountA;
    private int clickCountB;

    /**
     * Constructor for objects of class ButtonViewer
     */
    public ButtonViewer()
    {
        this.clickCountA = 0;
        this.clickCountB = 0;

        //1. Define and set up teh UI components
        this.frame = new JFrame();
        this.panel = new JPanel();

        this.label = new JLabel("0 clicks");
        this.panel.add(this.label);

        this.buttonA = new JButton("A");
        this.panel.add(this.buttonA);

        this.buttonB = new JButton("B");
        this.panel.add(this.buttonB);

        this.frame.add(this.panel);

        //2. Create the listener object
        ActionListener listener = new ActionListener()
            {
                public void actionPerformed(ActionEvent event)
                {
                    label.setText("button" + event.getActionCommand() + "was clicked");
                }
            };

        //3. Register listener object with component tht generates events
        this.buttonA.addActionListener(listener);
        this.buttonB.addActionListener(listener);

        this.frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
        this.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.frame.setVisible(true);
    }

    public static void main(String[] args)
    {
        ButtonViewer viewer = new ButtonViewer();
    }

    public class ClickListener implements ActionListener
    {
        public void actionPerformed(ActionEvent event)
        {
            if(event.getSource() == buttonA)
            {
                clickCountA++;
            }
            else if(event.getSource() == buttonB)
            {
                clickCountB++;
            }
            label.setText("A: " + clickCountA + "; B: " + clickCountB);
        }
    }
}
