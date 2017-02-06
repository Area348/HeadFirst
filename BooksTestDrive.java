//-- Head First java 2e, pagina 63.

class Books
{
	String title;
	String author;
}

class BooksTestDrive
{
	public static void main(String[] args)
	{
		int x = 0;
		
		Books[] myBooks = new Books[3];
	
		myBooks[0] = new Books();
		myBooks[1] = new Books();
		myBooks[2] = new Books();
	
		myBooks[0].title = "The Grapes of Java";
		myBooks[1].title = "The Java Gatshy";
		myBooks[2].title = "The Java Cookbook";
		
		myBooks[0].author = "Bob";
		myBooks[1].author = "Sue";
		myBooks[2].author = "Ian";

		while(x<3)
		{
			System.out.print(myBooks[x].title);
			System.out.print(" by ");
			System.out.println(myBooks[x].author);
			x=x+1;
		}
	
	
	
	}
	
	
}