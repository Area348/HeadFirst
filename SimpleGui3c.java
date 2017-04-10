import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
//-- HeadFirstJava 2e: p371

public class SimpleGui3c implements ActionListener
{
	JFrame frame;
	
	public static void main(String[] args)
	{
		SimpleGui3c gui = new SimpleGui3c();
		gui.go();
	}
	
	public void go()
	{
		frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton button = new JButton("Change colors");
		button.addActionListener(this);
		
		MyDrawPanel drawPanel = new MyDrawPanel();
		
		frame.getContentPane().add(BorderLayout.SOUTH, button);
		frame.getContentPane().add(BorderLayout.CENTER, drawPanel);
		frame.setSize(300,300);
		frame.setVisible(true);
	}
	
	public void actionPerformed(ActionEvent event)
	{
		frame.repaint();
	}
}

class MyDrawPanel extends JPanel
{
	public void paintComponent(Graphics g)
	{
		int red 	=	(int)(Math.random() * 255);
		int green 	=	(int)(Math.random() * 255);
		int blue	=	(int)(Math.random() * 255);
		
		Color randomColor = new Color(red, green, blue);
		g.setColor(randomColor);
		g.fillOval(70,70,100,100);
		
	}
}