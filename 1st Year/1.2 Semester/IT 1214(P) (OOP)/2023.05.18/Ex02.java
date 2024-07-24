//use the factorial of a number using for loop
import java.util.Scanner;
class Ex02
{
	public static void main(String args[])
	{
		System.out.print("enter a number : ");
		Scanner input = new Scanner(System.in);
		int number = input.nextInt();
		int tot=1;
		
		for(int i=1; i<=number; i++)
		{
			tot=tot*i;
		}
		System.out.print(number+ "! = " + tot);
	}
}