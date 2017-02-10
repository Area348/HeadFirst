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
} // close class
