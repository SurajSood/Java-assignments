package ShapesQuiz.java;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Polygon;
import java.awt.Rectangle;
import java.awt.geom.Line2D;

import javax.swing.JComponent;
import javax.swing.JFrame;

public class RectangleComponent extends JComponent 
{
	public static void main(String[] args)
	{
		JFrame frame = new JFrame(); 
	    frame.setSize(900, 600); 
	    frame.setTitle("Quiz shapes"); 
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 

	    RectangleComponent component = new RectangleComponent(); 
	    frame.add(component); 
	    frame.setVisible(true);
	}
		public void paintComponent(Graphics g)
		{
		java.awt.Graphics2D g2 = (Graphics2D) g;
        Rectangle box = new Rectangle(0,0,900,600);
        g2.draw(box);
        
        //Draw green rectangle
		Rectangle R1 = new Rectangle(200, 300, 300, 200);
		g2.setColor(Color.green);
		g2.draw(R1);
		g2.fillRect(200, 300, 300, 200);
		
		//Draw red arrow
		Line2D L1 = new Line2D.Double(700, 100, 700, 500);
		g2.setColor(Color.RED);
		g2.draw(L1);
		Line2D L2 = new Line2D.Double(600, 300, 700, 500);
		g2.draw(L2);
		Line2D L3 = new Line2D.Double(800, 300, 700, 500);
		g2.draw(L3);
		
		//Draw yellow triangle with black border
		Polygon P1 = new Polygon();
		P1.addPoint(300, 50);
		P1.addPoint(200, 225);
		P1.addPoint(400, 225);
		g2.setColor(Color.yellow);
		g2.fillPolygon(P1);
		g.setColor(Color.black);
		g2.drawPolygon(P1);
		
		//Draw blue triangle
		Polygon P2 = new Polygon();
		P2.addPoint(200, 100);
		P2.addPoint(400, 100);
		P2.addPoint(300, 275);
		g2.setColor(Color.blue);
		g2.drawPolygon(P2);
		g2.fillPolygon(P2);
	}
}
