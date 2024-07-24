import java.util.Scanner;
class Switch3
{
	public static void main(String args[])
	{
		Scanner x = new Scanner (System.in);
		System.out.print("Enter number of the day : ");
		int day = x.nextInt();
		
		String daytype;
		
		switch (day)
		{
			case 1:
			case 2:
			case 3:
			case 4:
			case 5:
			
				daytype="Week days";
				break;
				
			case 6:
			case 7:
				daytype="Weekend days";
				break;
				
			default:
				daytype="Wrong input";
				break;
			
			
			
		}
		System.out.println("Daytype : "+daytype);
	}
}