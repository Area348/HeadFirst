// HeadFirstJava 2e, pagina 121.
//import java.io.*;
class MixFor5 
{
	public static void main(String[] args) 
	{
		int x = 0;
		int y = 30;
		for (int outer = 0; outer < 3; outer++) 
		{
			//System.out.println("OuterLoop:");
			for(int inner = 4; inner > 1; inner--)
			{
				//System.out.println("\t Innerloop:");
				//System.out.println("\t\t" + x + " " + y + "");
				
				x = x + 0; //-- put in the CANDIDATE LINES!!!
				
				y = y - 2;
				//System.out.println("\t\t\t" + x + " " + y + "");
				if (x == 6) 
				{
					//System.out.println("Break");
					break;
				}
			x = x + 3;
			}
		y = y - 2;
		}
		//System.out.println("------------");
		System.out.println("" + x + " " + y + "");
	}
}

/*
Answers:

X=X+3;	==> 	54 6
X=X+6;	==>		60 10
X=X+2;	==>		45 6
X++;	==>		36 6
X--;	==>		18 6
X=X+0;	==>		6 14
*/