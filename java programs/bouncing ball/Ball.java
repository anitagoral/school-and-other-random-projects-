//bouncing Ball
//main application
//Anita R Goral
import java.awt.event.*;
import java.awt.Graphics;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.JFrame;
import javax.swing.Timer;

public class Ball
{
   // start application
   public static void main( String args[] )
   {
      JFrame frame = new JFrame( "Bouncing Ball" );
      frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );

      BallPanel bp = new BallPanel(); 
      frame.add( bp );
      frame.setSize( 300, 300 ); // set frame size
      frame.setVisible( true ); // display frame
   } // end main
}
