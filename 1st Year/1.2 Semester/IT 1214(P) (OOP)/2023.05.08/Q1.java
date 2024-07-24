
class Q1
{
	public static void main(String args[])
	{	//Q1: swap two numbers [x=5, y=7  ---> y=5, x=7]
		int x = 5;
		int y = 7;
		int z = x ;
		
		System.out.println("befor swap  x = "+x +" and " + " y = " + y);
		
		x = y;
		y = z;
		System.out.println("after swap x = "+x +" and " + " y = " + y);
	}
}