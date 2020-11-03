//bouncing Ball
//main application
//Anita R Goral

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;
import javax.swing.Timer;

// class BallPanel

class BallPanel extends JPanel implements ActionListener
{
   private int delay = 10;
   protected Timer timer;

   private int x = 0;		// x position
   private int y = 0;		// y position
   private int radius = 50;	// ball radius

   private int dx = 2;		// increment amount (x cord)
   private int dy = 2;		// increment amount (y cord)

   public BallPanel()
   {
      timer = new Timer(delay, this);
	timer.start();		// start the timer
   }

   public void actionPerformed(ActionEvent e)
   // runs when the timer starts
   {
	repaint();
   }


   public void paintComponent( Graphics g )
   {
      super.paintComponent( g ); // call superclass's paintComponent 
	g.setColor(Color.blue); //set ball color blue

	// check for boundaries
	if (x < radius)			dx = Math.abs(dx);
	if (x > getWidth() - radius)	dx = -Math.abs(dx);
	if (y < radius)			dy = Math.abs(dy);
	if (y > getHeight() - radius)	dy = -Math.abs(dy);

	// adjust ball position when it hits a wall
	x += dx;
	y += dy;
	g.fillOval(x - radius, y - radius, radius*2, radius*2);
   }
}