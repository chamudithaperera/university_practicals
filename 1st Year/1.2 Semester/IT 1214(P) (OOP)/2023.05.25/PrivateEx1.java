class PrivateEx1
{
	public static void main(String args[])
	{
		Exersice ob = new Exersice();
		ob.setSalary(2500.00);
		System.out.println("The salary is : "+ob.getSalary());
	}
}
class Exersice
{
	private double salary1;
	double salary;
	
	//getter and setter
	public double getSalary()
	{
		return salary;
	}
	public void setSalary(double salary)
	{
		this.salary=salary;
	}
}