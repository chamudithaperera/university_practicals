/*Q2 create object ob2 by passing age and name as aregument to contsructor
print the name age of ob2 as "elon" , 58
print the name name and age ob2*/
class PersonApp1
{
	public static void main(String args[])
	{
		Person ob = new Person();
		ob.setName("Tony");
		ob.setAge(45);
		System.out.println("Your name is : "+ob.getName());
		System.out.println("Your age is : "+ob.getAge());
		
		Person1 ob2 = new Person1();
		ob2.setName1("Elon");
		ob2.setAge1(58);
		System.out.println("Your name is : "+ob2.getName1());
		System.out.println("Your age is : "+ob2.getAge1());
	}
}

class Person
{
	private String name;
	private int age;
	
	public void setname(String name[])
	{
		this.name = name;
		this.age = age;
	}
	
	public String getName() //getter for name
	{
		return name;
	}
	
	public void setName(String name) //setter for name
	{
		this.name = name;
	}
	
	public int getAge() //getter for age
	{
		return age;
	}
	
	public void setAge(int age) //setter for age
	{
		this.age=age;
	}
}

class Person1
{
	private String name1;
	private int age1;
	
	public void setname1(String name[])
	{
		this.name1 = name1;
		this.age1 = age1;
	}
	
	public String getName1() //getter for name
	{
		return name1;
	}
	
	public void setName1(String name1) //setter for name
	{
		this.name1 = name1;
	}
	
	public int getAge1() //getter for age
	{
		return age1;
	}
	
	public void setAge1(int age1) //setter for age
	{
		this.age1=age1;
	}
}
