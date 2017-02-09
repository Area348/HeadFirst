// HeadFirst java 2e.
// Pagina 138
import java.util.ArrayList;

public class DotCom 
{
	private ArrayList<String> locationCells;

	public void setLocationCells(ArrayList<String> loc) 
	{
		locationCells = loc;
	}

	public String checkYourself(String stringGuess) 
	{
		String result = "miss";
		
		int index = locationCells.indexOf(userInput);
		if(index >= 0)
		{
			locationCells.remove(index);
			if(locationCells.isEmpty())
			{
				result = "kill";
			}
			else
			{
				result = "hit";
			}//close if
		}//Close outer if
		
		return result;
	} // close method
	
	public static void main(String[] args)
	{
		int 		numOfGuesses 	= 0;
		GameHelper 	helper 			= new GameHelper();
		
		SimpleDotCom theDotCom 		= new SimpleDotCom();
		int 		randomNum 		= (int) (Math.random()*5);
		int[] 		locations 		= {randomNum, randomNum+1, randomNum+2};
		theDotCom.setLocationCells(locations);
		boolean 	isAlive = true;
		
		while(isAlive == true)
		{
			String guess 	= helper.getUserInput("enter a number");
			String result 	= theDotCom.checkYourself(guess);
			
			numOfGuesses++;
			
			System.out.println(result);
			
			if(result.equals("kill"))
			{
				isAlive = false;
				System.out.println("You took " + numOfGuesses + " guesses");
			}
		}
	}
	
} // close class
