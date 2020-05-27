package NKFlag.java;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Polygon;
import java.awt.Rectangle;

import javax.swing.JComponent;
import javax.swing.JFrame;

public class FlagComponent extends JComponent
{
	public static void main(String[] args)
    {
        JFrame frame = new JFrame();
        frame.setSize(800, 600);
        frame.setTitle("North Korea's flag");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        FlagComponent component = new FlagComponent();
        frame.add(component);
        frame.setVisible(true);
    }
	
    public void paintComponent(Graphics g)
    {
        //Recover Graphics2D
        Graphics2D g2 = (Graphics2D)g;

        //Draw the rectangle
        Rectangle R1 = new Rectangle(0, 0, 900, 600);
        g2.draw(R1);
        g2.setColor(Color.red);
        g2.fillRect(0, 0, 900, 600);

        //Draw the stripes
        Rectangle R2 = new Rectangle(0, 0, 900, 80);
        g2.draw(R2);
        g2.setColor(Color.blue);
        g2.fillRect(0, 0, 901, 80);

        Rectangle R3 = new Rectangle(0, 80, 900, 16);
        g2.draw(R3);
        g2.setColor(Color.white);
        g2.fillRect(0, 80, 900, 16);

        Rectangle R4 = new Rectangle(0, 520, 901, 80);
        g2.draw(R4);
        g2.setColor(Color.blue);
        g2.fillRect(0, 520, 901, 80);

        Rectangle R5 = new Rectangle(0, 505, 900, 15);
        g2.draw(R5);
        g2.setColor(Color.white);
        g2.fillRect(0, 505, 900, 15);

        //Draw the circle
        g2.drawOval(175, 175, 250, 250);
        g2.setColor(Color.white);
        g2.fillOval(175, 175, 250, 250);
        
        //Draw the star
        int xpoints[] = {300, 380, 180, 420, 220};
        int ypoints[] = {180, 390, 270, 270, 390};
        int npoints = 5;
        g.setColor(Color.red);
        g.fillPolygon(xpoints, ypoints, npoints);
      
        //Color the center of the star
        Polygon myPoly = new Polygon();
        myPoly.addPoint(265,270);
        myPoly.addPoint(335,270);
        myPoly.addPoint(351,315);
        myPoly.addPoint(300,342);
        myPoly.addPoint(249,315);
        g2.drawPolygon(myPoly);
        g2.setColor(Color.red);
        g2.fillPolygon(myPoly);
    }
}
