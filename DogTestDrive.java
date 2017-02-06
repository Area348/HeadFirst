class DogTestDrive
{
	public static void main(String[] args)
	{
		//-- Head First java 2e, pagina 73
		Dog one 	=	new Dog();
		one.size 	= 	70;
		Dog two		=	new Dog();
		two.size	=	8;
		Dog three	=	new Dog();
		three.size	=	35;
	
		one.bark();
		two.bark();
		three.bark();
	
	}
}

class Dog
{
		int 	size;
		String	breed;
		String 	name;
		
		void bark()
		{
			//-- Head First java 2e, pagina 65.
			if(size>60)
			{ 
				System.out.println("Wooof! Wooof!");
			}
			else if (size > 14)
			{
				System.out.println("Ruff! Ruff!");
			}
			else
			{
				System.out.println("Yip! Yip!");
			}
		
		}
}