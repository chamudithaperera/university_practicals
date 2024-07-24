import java.util.Scanner;
public class  Ex03
{
	public static void main(String args[])
	{
		//creates a reader instance which takes
		//input from standard input - keyboard
		
		Scanner reader = new Scanner(System.in);
		System.out.print("Enter a number :");
		
		//nextInt() reads the next 
		int number = reader.nextInt();
		
		System.out.println("You entered : "+number);
	}
}