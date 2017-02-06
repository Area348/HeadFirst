//-- Head First Jva 2e page: 62
class DogTemp

{
	String name;
	
	public static void main(String[] args)
	{
		
		
		//-- Make a Dog object and access it.
		DogTemp dog1 = new DogTemp();
		dog1.bark();
		dog1.name = "Bart";
		
		//-- Nog make a Dog array
		DogTemp[] myDogs = new DogTemp[3];
		//-- And put some dogs in it.
		
		myDogs[0] = new DogTemp();
		myDogs[1] = new DogTemp();
		myDogs[2] = dog1;
		
		//-- Now access te Dogs using the array
		//-- references
		myDogs[0].name = "Fred";
		myDogs[1].name = "Marge";
		
		//-- Hmmm... waht is myDogs[2] name?
		System.out.print("last dog's name is ");
		System.out.println(myDogs[2].name);
		
		//-- Now loop throug the array
		//-- and tell all dogs to bark
		int x = 0;
		while (x < myDogs.length)
		{
			myDogs[x].bark();
			x = x + 1;
		}
	}
	
	public void bark()
	{
		System.out.println( name + " says Ruff!");
		
	}
	
	//public void eat(){}
	//public void caseCat(){};
}