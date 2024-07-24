//Java switch statement
//java program to check the site
//using the switch .. case statement
class Switch1
{
	public static void main(String args[])
	{
		int number=44;
		String size;
		//switch the statement to check T-shirt size
		
		switch (number)
		{
			case 49:
				size="Extra large";
				break;
			
			case 44:
				size="large";
				break;
			
			case 42:
				size="medium";
				break;
			
			case 29:
				size="small";
				break;
			
			default:
				size="unknown";
				break;
			
		}
		System.out.println("Size : "+size);
	}
}