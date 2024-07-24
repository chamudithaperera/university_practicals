import java.util.Scanner;
class Condition2
{
	public static void main(String args[])
	{	
		//Check an alphabet is a vowel or a consonant
		Scanner num = new Scanner(System.in);
		System.out.print("Enter an alphabet letter : ");
		char x = num.next().charAt(0);
		
		if(x=='a' || x=='e' || x=='i' || x=='o' || x=='u' || x=='A' || x=='E' || x=='I' || x=='O' || x=='U' )
		{
			System.out.print("You entered " + x +" it is a vowel letter. \n");
		}
		else
		{
			System.out.print("You entered " + x +" and it is a consonant letter. \n");
		}
		
	}
}