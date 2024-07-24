/*Calculate power of a number using a while loop*/
class MyMain
{ public static void main(String args[])
 {
	int b = 2, e = 5;      //b= base  e= exponent
	long r = 1;            //r = result
	
	for(; e!=0; --e)
	{
		r *= b ;           //32 = 2*2*2*2*2
	}
	System.out.println("Answer is: "+r);
 }		
}