//-- HeadFirst Java 2e p390
import javax.sound.midi.*;

public class MiniMusicPlayer2 implements ControllerEventListener
{
	public static void main(String[] args)
	{
		MiniMusicPlayer2 mini = new MiniMusicPlayer2();
		mini.go();
	}
	public void go()
	{
		
		try
		{
		//-- Make (and open) a sequcencer
			Sequencer sequencer = MidiSystem.getSequencer();
			sequencer.open();					
			
			int[] eventsIWant= {127};
			sequencer.addControllerEventListener(this, eventsIWant);
			
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
			//-- Here's how we pick up the beat -- we insert our OWN ControllerEventListener
			//-- (176 says the event type is ControllerEvent) with an argument for
			//-- event number #127. This event will do NOTHING! We put it in JUST so that
			//-- we can get an event eacht time a note is played.
			//-- In other words, its sole purpose is so that something will fire that WE 
			//-- can listen for (we can't listen for NOTE ON/OFF events).
			//-- Note that we're making this event happen at the SAME tick as the NOTE ON.
			//-- So when the NOTE ON event happens we'll know about it because OUR event will
			//-- fire at the same time.
				track.add(makeEvent(176,1,127,0,i));
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
	}//-- Close go() method.
	
	//-- The event handler method (from the controller-event listener interface).
	//-- Each time we get the, we'll print "La" to the commandline.
	public void controlChange(ShortMessage event)
	{
		System.out.println("la");
	}
	
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
