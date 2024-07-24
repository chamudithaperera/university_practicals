import java.util.Scanner;
class Condition1
{
	public static void main(String args[])
	{	
		//check whether a userinput is odd or even
		Scanner num = new Scanner(System.in);
		System.out.print("Enter your number : ");
		int x = num.nextInt();
		
		if(x%2==0)
		{
			System.out.print("You entered " + x +" it is a even number. \n");
		}
		else
		{
			System.out.print("You entered " + x +" and it is a odd number. \n");
		}
		
	}
}