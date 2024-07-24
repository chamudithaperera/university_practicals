/*Reverse a number using a while loop in Java*/

class MyMain
{ public static void main(String args[])
 {
	int num = 1234, r = 0;        //r = reverse
	
	System.out.println("Original Number"+num);
	
	while(num != 0)
	{
		int d = num%10;        //d= Digit
		r = r*10 +d;
		
		num /=10;
	}
	System.out.println("Reversed Number: "+r);
 }		
}