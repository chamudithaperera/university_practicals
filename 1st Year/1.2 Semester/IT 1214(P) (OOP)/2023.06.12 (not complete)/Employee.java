public class Employee
{
	private String name;
	private String role;
	
	public Employee(String name, String role)
	{
		this.name=name;
		this.role=role;
	}
	
	public String getName()
	{
		return name;
	}
	public String getRole()
	{
		return role;
	}
	
	public double calculateSalary()
	{
		return 0.0; 
	}
	
	public static void main(String args[])
	{
		Employee object1 = new Manager("Alex",20000.00,500.00);
		System.out.println("Name: "+object1.getName());
		System.out.println("Role: "+object1.getRole());
		System.out.println("Salary: "+object1.calculateSalary());
		
		Employee object2 = new Manager("Peter",25000.00,400.00);
		System.out.println("Name: "+object2.getName());
		System.out.println("Role: "+object2.getRole());
		System.out.println("Salary: "+object2.calculateSalary());
	}
	

	
}
class Manager extends Employee
{
	private double basicSalary;
	private double  bonus;
	
	public Manager(String name, double basicSalary, double  bonus)
	{
		//initialize the constructor using super
		super(name,"Manager");
		this.basicSalary=basicSalary;
		this.bonus=bonus;
	}
	
	public double calculateSalary(double basicSalary, double  bonus)
	{
		return basicSalary+bonus;
	}
}

class HR extends Employee
{
	private double basicSalary;
	private double  bonus;
	
	public HR(String name, double basicSalary, double  bonus)
	{
		//initialize the constructor using super
		super(name,"HR");
		this.basicSalary=basicSalary;
		this.bonus=bonus;
	}
	
	public double calculateSalary(double basicSalary, double  bonus)
	{
		return basicSalary+bonus;
	}
}