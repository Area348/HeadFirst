//- HeadFirstJava 2e. p384 - 385

import javax.swing.*;
import java.awt.*;

public class SimpleAnimation
{
	int x = 70;
	int y = 70;
	
	public static void main(String[] args)
	{
		SimpleAnimation gui = new SimpleAnimation();
		gui.go();
	}
	
	public void go()
	{
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		MyDrawPanel drawPanel = new MyDrawPanel();
		
		frame.getContentPane().add(drawPanel);
		frame.setSize(300,300);
		frame.setVisible(true);
		
		for(int i = 0; i<130; i++)
		{
			x++;
			y++;
			
			drawPanel.repaint(); //-- Tell the panel to repaint itself (so we can see the circle in the new locaiton)
			
			try
			{
				Thread.sleep(30);
			}
			catch(Exception ex){}
			
		}//-- Close For loop
	}//-- Close void() method
	
	class MyDrawPanel extends JPanel
	{
		public void paintComponent(Graphics g)
		{
			g.setColor(Color.white);
			g.fillRect(0,0,this.getWidth(), this.getHeight() );
			
			g.setColor(Color.green);
			g.fillOval(x,y,40,40);
		}//-- Close paintComponent method()
	}//-- Close inner class MyDrawPanel
	
	
}//-- Close SimpleAnimation Class.