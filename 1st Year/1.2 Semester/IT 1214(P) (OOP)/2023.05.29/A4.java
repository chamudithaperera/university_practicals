/*Reverse a number using a For loop in Java*/
class MyMain
{ public static void main(String args[])
 {
	int num = 1234567, r = 0;        //r = reverse
	
	for(; num != 0; num/=10)
	{
		int d = num%10;              //d = Digit
		r = r*10 + d;
	}
	
	System.out.println("Reversed Number: "+r);
 }		
}