import javax.sound.midi.*; //-- Java MidiPackage import

public class MiniMiniMusicApp
{
	public static void main(String[] arg)
	{
		MiniMiniMusicApp $mini = new MiniMiniMusicApp();
		$mini.play();
	}
	
	public void play()
	{
		try
		{
			//-- Get a Sequencer and open it (So we can use it.. a squencer doesn't come already open.)
			Sequencer $player = MidiSystem.getSequencer();
			$player.open();
			
			
			Sequence $seq = new Sequence(Sequence.PPQ, 4);
			
			//-- Ask the sequenver for a track. Remeber, the track lives in the sequencer and the midi data lives in the track.
			Track $track = $seq.createTrack();
			
			//-- Put soms MidiEvents into the Track.
			ShortMessage $a = new ShortMessage();
			$a.setMessage(144,1,44,100);
			MidiEvent $noteOn = new MidiEvent ($a,1);
			$track.add($noteOn);
			
			ShortMessage $b = new ShortMessage();
			$b.setMessage(128,1,44,100);
			MidiEvent $noteOff = new MidiEvent($b,16);
			$track.add($noteOff);
			
			//-- Give the sequence to the sequencer(Like putting the CD in the C player).
			$player.setSequence($seq);
			
			//-- Start the seq (like pushing PLAY).
			$player.start();
			
		}
		catch (Exception $ex)
		{	
			$ex.printStackTrace();
		}
	}//-- Close Play()
}//-- Close Class 