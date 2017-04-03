import javax.sound.midi.*;

public class MusicTest1
{
	public void play()
	{
		
		try
		{
		
			Sequencer sequencer = MidiSystem.getSequencer();
			System.out.println("Successfully got a sequencer");
		}catch(MidiUnavailableException ex) {
			System.out.println("Bummer");
		}
	
	
	}//-- Close Play
	
	
	public static void main (String[] args)
	{
		MusicTest1 mt = new MusicTest1();
		mt.play();
	}//-- Close Main	
}//-- Close Class