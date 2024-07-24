//generate the multiple table using for loop

import java.util.Scanner;
class Ex04
{
	public static void main(String args[])
	{
		System.out.print("enter a number : ");
		Scanner input = new Scanner(System.in);
		int number = input.nextInt();
		
		for(int i= 1; i<=10; i++)
		{
			System.out.printf("%d * %d - %d \n", number, i, number *i);
		}
		
	}
		
}
