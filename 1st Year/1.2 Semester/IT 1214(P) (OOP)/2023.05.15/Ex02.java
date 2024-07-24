//compute the sum of 5 positive numbers
import java.util.Scanner;
class Ex02
{
	public static void main(String args[])
	{
		
		Double number , sum = 0.0;
		//create an object of Scanner
		Scanner input = new Scanner(System.in);
		for (int i=1; i<6; ++i)
		{
			System.out.print("Enter number : ");
			number = input.nextDouble();
			
			if(number <= 0.0)
			{
				continue;
			}
			sum +=number;
		}
		System.out.println("sum = "+sum);
	}
}