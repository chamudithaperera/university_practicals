abstract class Bike
{
	abstract void run();
	
	void printColor()
	{
		System.out.println("Black");
	}
}

class Honda extends Bike
{
	void run()
	{
		System.out.println("running safely");
	}
	
	void printColor()
	{
		System.out.println("white");
	}
	
	public static void main(String args[])
	{
		Bike obj = new Honda();
		obj.run();
	}
}
