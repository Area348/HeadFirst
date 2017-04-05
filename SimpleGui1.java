//-- HeadFirstJava 2e. P. 356.
import javax.swing.*;

public class SimpleGui1
{
	public static void main(String[] args)
	{
		JFrame $frame 	= new JFrame();
		JButton $button = new JButton("click me");
	
		$frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		$frame.getContentPane().add($button);	//-- Voeg object toe aan het $frame.
		$frame.setSize(300,300);				//-- Geef de dimensies van het frame op.
		$frame.setVisible(true);				//-- Geef aan dat je het frame wil zien.
		
	}
}