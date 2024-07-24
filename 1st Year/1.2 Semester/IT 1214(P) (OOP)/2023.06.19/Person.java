/*Exersice 02
create an abstract class called Person with the following properties and methods:

Properties:
	name (String) : Represents the name of the person
	
Methods:
	getnme() : Returns the name of the person
	displayInfo() : An abstract method that diplays information about the person

create a interface called Student with the following method:

Implment the displayInfo() Metohd from the Person class and the */

abstract classs Person
{
	protected String name
	
		public Person(String name)
		{
			this.name=name;
		}
		
		public String getname()
		{
			return name;
		}
		
		public abstrict void displayInfo();
	
}

interface Student
{
	int getId();
	double double grade;
}

class Undergraduate extends Person implements students
{
	private int id;
	private double grade;
	
	public undergraduate(String name, int id, double grade)
	{
		super(name);
		this.id=id;
		this.grade=grade;
	}
	
	@Override
	{
		public int getId()
		{
			return id;
		}
	}

}