class MovieTestDrive
{
	public static void main(String[] args)
	{
		
		Movie 	one 	= 	new Movie();
		one.title		=	"Gone with the stock";
		one.genre		=	"Tragic";
		one.rating		=	-2;
		one.playIt();
		
		Movie 	two		= 	new Movie();
		two.title		=	"Lost in cubicle Space";
		two.genre		=	"Comedy";
		two.rating		=	5;
		two.playIt();
		
		Movie 	three	=	new Movie();
		three.title		=	"Byte club";
		three.genre		=	"Tragic but ultimately uplifting";
		three.rating	=	127;
		three.playIt();
		
	}
}

class Movie
{
	String title;
	String genre;
	int rating;
	
	void playIt()
	{
		System.out.println("Playing the movie: " + title );
		System.out.println("This movies genre is: " + genre);
		System.out.println("Movie rating: " + rating);
		System.out.println("");
	
	}
}