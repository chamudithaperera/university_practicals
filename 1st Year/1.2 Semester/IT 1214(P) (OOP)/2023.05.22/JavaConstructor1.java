class JavaConstructor1
{
	String name;
	int age;
	double gpa;
	
	JavaConstructor1(String name, int age, double gpa)
	{
		this.name=name;
		this.age=age;
		this.gpa=gpa;
	}
	
	public void printGPA()
	{
		System.out.println("The GPA is : "+gpa);
	}
	
	public static void main(String args[])
	{
		
		JavaConstructor1 ob1 = new JavaConstructor1("Tony", 25, 4.3);
		System.out.println("the nam e"+ob1.name);
	
		JavaConstructor1 ob2 = new JavaConstructor1("Alex", 34, 2.09);
		System.out.println("the gpa " + ob2.gpa);
	}
}