import javax.sound.midi.*;

public class MiniMusicPlayer1
{
	public static void main(String[] args)
	{
		
		try
		{
		//-- Make (and open) a sequcencer
			Sequencer sequencer = MidiSystem.getSequencer();
			sequencer.open();					
			
		//--Make a seguence and a track.
			Sequence seq = new Sequence(Sequence.PPQ, 4);
			Track track = seq.createTrack();
			
		//-- Make a bunch of events to make the notes keep going up 
		//-- (from piano note 5 to piano note 61)	
			for(int i = 5; i< 61; i += 4)
			{
				
			//-- Call out new makeEvent() method to make the message and event,
			//-- then add the result (the MidiEvent returned form makeEvent())
			//-- the track. There are NOTE ON (144) and NOTE OFF (128) pairs.
				track.add(makeEvent(144,1,i,100,i));
				track.add(makeEvent(128,1,i,100,i + 2));
				
			}//-- End for loop.
			
		//-- Start it running	
			sequencer.setSequence(seq);
			sequencer.setTempoInBPM(220);
			sequencer.start();
			
		}
		catch (Exception ex)
		{
			ex.printStackTrace();
		}
	}//-- Close main method.
	
	public static MidiEvent makeEvent(int comd, int chan, int one, int two, int tick)
	{
		MidiEvent event = null;
		
		try
		{
				ShortMessage a = new ShortMessage();
				a.setMessage(comd, chan, one, two);
				event = new MidiEvent(a, tick);
		}
		catch(Exception e)
		{}
		return event;
	}//-- Close makeEvent method.
	
}//-- Close class.
