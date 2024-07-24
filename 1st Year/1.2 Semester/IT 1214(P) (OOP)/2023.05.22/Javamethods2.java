//create methods add, sub, mul, div
import java.util.Scanner;
class Javamethods2
{
	public int add(int num1, int num2)
	{
		int sum = num1+num2;
		return sum;
	}
	
	public int sub(int val1, int val2)
	{
		int sub =val1-val2;
		return sub;
	}
	
	public int mul(int mul1, int mul2)
	{
		int mul =mul1*mul2;
		return mul;
	}
	
	public int div(int div1, int div2)
	{
		int div =div1/div2;
		return div;
	}

	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a value for a : ");
		int a = sc.nextInt();
		System.out.print("Enter a value for b : ");
		int b = sc.nextInt();
		Javamethods2 ob = new Javamethods2();
		System.out.println("Sum is : "+ob.add(a,b));
		System.out.println("Sub is : "+ob.sub(a,b));
		System.out.println("mul is : "+ob.mul(a,b));
		System.out.println("div is : "+ob.div(a,b));
		
	}
}