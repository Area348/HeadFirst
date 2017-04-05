//-- HeadFirstJava 2e. P. 360.
import javax.swing.*;
import java.awt.event.*;

public class SimpleGui1B implements ActionListener
{
	JButton $button;
	
	public static void main(String[] args)
	{
		SimpleGui1B $gui = new SimpleGui1B();
		$gui.go();
	}
	
	public void go()
	{
		
		JFrame $frame 	= new JFrame();
		$button 		= new JButton("click me");
		
		$button.addActionListener(this);
		
	
		$frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		$frame.getContentPane().add($button);	//-- Voeg object toe aan het $frame.
		$frame.setSize(300,300);				//-- Geef de dimensies van het frame op.
		$frame.setVisible(true);				//-- Geef aan dat je het frame wil zien.
		
	}
	
	public void actionPerformed(ActionEvent event)
	{
		$button.setText("I've been clicked!");
	}
	
}