//display sum of n natural numbers 
import java.util.Scanner;
class Loop2
{
	public static void main(String args[])
	{
		Scanner x = new Scanner (System.in);
		System.out.print("Enter a number : ");
		int n = x.nextInt();
		int total=0;
		
		for(int i=1; i<=n; i++)
		{
			System.out.print(i + " + ");
			total+=i;
		}
		System.out.println(" total = " + total);
	}
}