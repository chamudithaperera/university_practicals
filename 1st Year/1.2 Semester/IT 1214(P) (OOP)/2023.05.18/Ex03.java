//display the fibonacci series using for loop
import java.util.Scanner;
class Ex03
{
	public static void main(String args[])
	{
		System.out.print("enter a number : ");
		Scanner input = new Scanner(System.in);
		int number = input.nextInt();
		int firstterm=0 , secondterm=1;
		
		System.out.print("fibonacci series till "+number +" = ");
		
		for(int i=1; i<=number; i++)
		{
			System.out.print(firstterm + ", ");
			
			int nextTerm = firstterm + secondterm;
			firstterm = secondterm;
			secondterm = nextTerm;
		}
		
	}
}