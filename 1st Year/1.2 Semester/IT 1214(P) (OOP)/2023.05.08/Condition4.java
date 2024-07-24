import java.util.Scanner;
class Condition4
{
	public static void main(String args[])
	{	
		//Initialize 3 double variables p,q,r. find the largest value from p,q,r
		Scanner num1 = new Scanner(System.in);
		System.out.print("Enter a number for p  : ");
		double p = num1.nextDouble();
		
		Scanner num2 = new Scanner(System.in);
		System.out.print("Enter a number for q  : ");
		double q = num2.nextDouble();
		
		Scanner num3 = new Scanner(System.in);
		System.out.print("Enter a number for r  : ");
		double r = num3.nextDouble();
		
		if(p>q)
		{
			if (p>r)
			{
				System.out.print(p +" is the largest number \n");
			}
		}
		else if(q>r)
		{
			System.out.print(q +" is the largest number \n");
		}
		else
		{
			System.out.print(r +" is the largest number \n");
		}
		
	}
}