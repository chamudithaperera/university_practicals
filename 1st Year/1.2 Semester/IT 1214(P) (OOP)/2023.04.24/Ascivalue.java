class  Ascivalue
{
	public static void main(String args[])
	{
		char ch = 'a';
		int asci = ch;
		// you can also cast char to int
		int castAsci = (int) ch;
		
		System.out.println("The ASCII value of "+ ch + " is " + asci);
		System.out.println("The ASCII value of "+ ch + " is " + castAsci);
	}
}