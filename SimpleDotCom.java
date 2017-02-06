
public class SimpleDotCom 
{
	int[] locationCells;
	int numOfHits = 0;
	public void setLocationCells(int[] locs) 
	{
		locationCells = locs;
	}

	public String checkYourself(String stringGuess) 
	{
		int guess = Integer.parseInt(stringGuess);
		String result = "miss";
		
		for (int cell : locationCells) 
		{
			if (guess == cell) {
			result = "hit";
			numOfHits++;
			break;
			}
		} // out of the loop

		
		if (numOfHits == locationCells.length) 
		{
			result = "kill";
		}
		
		System.out.println(result);
		return result;
	} // close method
} // close class
/*
public class SimpleDotCom
{
//-- Set vars.
	int[] locationCells;
	int numOfHits = 0;

	public void setLocationCells(int[] locs)
	{
		locationCells = locs;
	}
	
	
	
//-- Method om te kijken of er een hit, miss of kill is.
	public String checkYourself(String stringGuess)
	{
		int guess 		= Integer.parseInt(stringGuess);
		String result 	= "miss";
		
	//-- Loop de inhoud van locationCells net zo vaak als dat dat die inhout heeft.
		for (int cell : locationCells)
		{
		//-- Als de ingevoerd waarde gelijk is aan een cell met target geef een hit als resultaat.
			if(guess == cell)
			{
				result = "hit";		//-- Set de waarde hit in result.
				numOfHits++;		//-- doe +1 bij numOfHits
				break;				//-- Stop de for loop omdat er al een hit is.
			}
		}
		
	//-- Kijk of er net zo veel hits zijn als dat locationCells lang is.	
		if (numOfHits == locationCells.length)
		{
		//-- Set de waarde kill in result.
			result = "kill";
		}
		
		System.out.println(result);
		return result;	//-- Geef de waarde in result terug naar waar de method aan gesproken wordt.
		
	}
}
*/