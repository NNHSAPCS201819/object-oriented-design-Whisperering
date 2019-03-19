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
    /**
     * Default constructor for objects of class DrawingEditor
     */
    /*
     * Main method that creates a DrawingEditor object and opens
     * a window on the screen
     */
    public DrawingEditor()
    {
        this.setTitle( "Drawing Editor" );
        this.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        
        DrawingPanel canvas = new DrawingPanel();
        ControlPanel controls = new ControlPanel( canvas );
        
        // canvas and controls panels added to the frame
        this.add(canvas, BorderLayout.CENTER);
        this.add(controls, BorderLayout.PAGE_END);
        this.setSize(500,500);
        //
        this.pack();
        this.setVisible( true );
    }
    
    
    public static void main( String[] args )
    {
       DrawingEditor drawingEditor = new DrawingEditor();
    }

}
