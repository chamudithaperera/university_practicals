class Javamethods
{
	int a=10, b=20, c;
	
	int addNum()
	{
		c=a+b;
		return c;
	}
	public static void main(String args[])
	{
		Javamethods ob = new Javamethods();
		System.out.println(ob.addNum());
	}
}