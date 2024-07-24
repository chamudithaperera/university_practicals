//display sum of natural numbers 1 to 1000
class Loop3
{
	public static void main(String args[])
	{
		
		int n = 1000 , total=0;
		
		for(int i=1; i<=n; i++)
		{
			total+=i;
		}
		System.out.println(" sum of natural numbers 1 to 1000 is : " + total);
	}
}