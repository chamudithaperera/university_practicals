class PersonApp
{
	public static void main(String args[])
	{
		Person ob = new Person();
		ob.setName("Chamu");
		ob.setAge(25);
		System.out.println("Your name is : "+ob.getName());
		System.out.println("Your age is : "+ob.getAge());
	}
}

class Person
{
	private String name;
	private int age;
	
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

	
