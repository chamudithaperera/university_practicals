//create a class student
//student has attributes name, age, gpa
//student has a method printGPA()
//create an object of student
//assign value to the attributes
//call method printGPA()

class Javamethods3
{
	String name;
	int age;
	double gpa;
	
	public void printGPA()
	{
		System.out.println("The GPA is : "+gpa);
	}
	
	public static void main(String args[])
	{
		
		Javamethods3 ob = new Javamethods3();
		ob.name="Tony";
		ob.age=25;
		ob.gpa=3.65;
		
		ob.printGPA();
		
	}
}