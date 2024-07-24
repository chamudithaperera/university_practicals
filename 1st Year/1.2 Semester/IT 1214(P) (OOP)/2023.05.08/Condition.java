import java.util.Scanner;
class Condition
{
	public static void main(String args[])
	{	
		//Print a whether a number is positive or negative
		Scanner num = new Scanner(System.in);
		System.out.print("Enter your number : ");
		int x = num.nextInt();
		
		if(x>=0)
		{
			System.out.print("You entered " + x +" it is a positive number. \n");
		}
		else
		{
			System.out.print("You entered " + x +" and it is a nevative number. \n");
		}
		
	}
}