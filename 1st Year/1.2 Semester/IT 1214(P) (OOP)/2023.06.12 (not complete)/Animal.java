/*create a class animal with method makeSound()
create a subclass cat of animal which over rides the method makeSound()*/
public class Animal
{	
	public void makeSound()
	{
	}
	
	public static void main(String args[])
	{
		//create an object animal
		Animal ob1 = new Animal();
		
		//call method makeSound()
		ob1.makeSound();
		
		
		//create an object for cat
		Cat ob2 = new Cat();
		
		//call method makeSound()
		ob2.makeSound();
	}
}

class Cat extends Animal
{
	public void makeSound()
	{
		System.out.print("Meow!!");
	}
}

