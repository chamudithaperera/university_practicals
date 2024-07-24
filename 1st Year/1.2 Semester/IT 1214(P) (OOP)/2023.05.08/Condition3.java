import java.util.Scanner;
class Condition3
{
	public static void main(String args[])
	{	
		//Following program detemine the grade based
		Scanner num = new Scanner(System.in);
		System.out.print("Enter your marks : ");
		int x = num.nextInt();
		
		if(x>75)
		{
			System.out.print("Your marks is " + x +" and your grade is A \n");
		}
		else if(x>65)
		{
			System.out.print("Your marks is " + x +" and your grade is B \n");
		}
		else if(x>55)
		{
			System.out.print("Your marks is " + x +" and your grade is C \n");
		}
		else if(x>35)
		{
			System.out.print("Your marks is " + x +" and your grade is S \n");
		}
		else
		{
			System.out.print("Your marks is " + x +" and your grade is F \n");
		}
	}
}