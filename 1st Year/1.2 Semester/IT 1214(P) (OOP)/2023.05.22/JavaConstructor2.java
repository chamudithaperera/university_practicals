/*Q3 create a class pen which has attributes color and type (gel/ballpoint)
and the method write()
create a parameterized constructor
create 2 objects of pen class ob1: blue gel ob2: red ballpoint
*/

class JavaConstructor2
{
	String color, type;
	
	JavaConstructor2(String color, String type)
	{
		this.color=color;
		this.type=type;
	}
	public static void main(String args[])
	{
		
		JavaConstructor2 ob1 = new JavaConstructor2("blue","gel");
		System.out.println("First pen is"+ob1.color+ " " +ob1.type);
	
		JavaConstructor2 ob2 = new JavaConstructor2("red", "ballpoint");
		System.out.println("Second pen is"+ob2.color+ " " +ob2.type);
	}
}