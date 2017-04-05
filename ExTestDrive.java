class MyEx extends Exception
{

}

public class ExTestDrive
{
	public static void main(String[] args)
	{
		String test = args[0];
		
		try
		{
		//-- Print TH op het scherm
			System.out.print("t");
			System.out.print("h");
		
		//-- Draai de Test met als waarde test mee gegeven.
			doRisky(test);
			
		//-- Sla R & O over bij een throw en ga door naar A	
			System.out.print("r");
			System.out.print("o");

		}
		catch (MyEx e)
		{
			System.out.print("a");
			
		}
		finally
		{
			System.out.print("w");
			System.out.print("s");	
		}
	
	}
	
	static void doRisky(String t) throws MyEx
	{
	//-- Kijk of de mee gegeven waarde "yes" is. 
	//-- Zo niet doe niets, zo ja throw een MyEx() exception
		if("yes".equals(t))
		{
			throw new MyEx();
		}
	}
	
}