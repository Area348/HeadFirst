//-- HeadFirst Java 2e p395.

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

class InnerButton
{
	JFrame frame;
	JButton b;
	
	public static void main(String[] args)
	{
		InnerButton gui = new InnerButton();
		gui.go();
	}
	
	public void go()
	{
		frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		b = new JButton("A");
		b.addActionListener(new BLister());
		
		frame.getContentPane().add(BorderLayout.SOUTH, b);
		frame.setSize(200,100);
		frame.setVisible(true);
	}
	
	class BLister implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			if(b.getText().equals("A"))
			{
				b.setText("B");
			}
			else
			{
				b.setText("A");
			}//-- End of if statment
		}// End of actionPerformed method()
	}// End of inner class BLister
}// End of class Innetbutton