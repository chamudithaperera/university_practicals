//display sum of the positive numbers using while loop take the user input
import java.util.Scanner;
class Whileloop1
{
	public static void main(String args[])
	{
		Scanner x = new Scanner (System.in);
		System.out.print("Enter a number : ");
		int n = x.nextInt();
		int total=0 , num=1;
		
		while(num<=n)
		{
			total+=num;
			num+=1;
		}
		System.out.println("sum of the positive numbers : " + total);
	}
}