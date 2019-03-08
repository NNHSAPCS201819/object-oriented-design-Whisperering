import javax.swing.JFrame;
import java.awt.BorderLayout;


/**
 * The window for the drawing editor.
 * 
 * @author gcschmit
 * @version 23 June 2015
 */
public class DrawingEditor extends JFrame
{
    private JFrame frame;
    /**
     * Default constructor for objects of class DrawingEditor
     */
    public DrawingEditor()
    {
        this.setTitle( "Drawing Editor" );
        this.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        
        DrawingPanel canvas = new DrawingPanel();
        ControlPanel controls = new ControlPanel( canvas );
        
        // add the canvas and controls panels to the frame
        // read the BorderLayout class documentation for specifics
        
        //
        this.frame = new JFrame();
        this.frame.add(canvas, BorderLayout.CENTER);
        this.frame.add(controls, BorderLayout.PAGE_END);
        this.frame.setSize(500,500);
        //
        this.pack();
        this.setVisible( true );
    }
    
    
    public static void main( String[] args )
    {
       DrawingEditor drawingEditor = new DrawingEditor();
    }

}
