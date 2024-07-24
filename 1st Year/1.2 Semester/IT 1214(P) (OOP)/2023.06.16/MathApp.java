import java.util.Scanner;
class MathApp
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter x : ");
		int x=sc.nextInt();
		System.out.print("Enter y : ");
		int y=sc.nextInt();
		
		Math1 math1 = new Math1();
		System.out.println(x + " + " + y + " = " + math1.sum(x,y));
		System.out.println(x + " - " + y + " = " + math1.sub(x,y));
		System.out.println(x + " * " + y + " = " + math1.mul(x,y));
		System.out.println(x + " / " + y + " = " + math1.div(x,y));
		System.out.println("maximun is : " + math1.findMath(x,y));
		
		if(math1.isEven(y))
		{
			System.out.print(x + "is Even");
		}
		else
		{
			System.out.print(x + "is Odd");
		}
	}
}