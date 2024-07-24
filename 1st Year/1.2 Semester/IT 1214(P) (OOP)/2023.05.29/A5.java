/*Calculate power of a number using a while loop*/
class MyMain
{ public static void main(String args[])
 {
	int b = 3, e = 4;      //b= base  e= exponent
	long r = 1;            //r = result
	
	while(e != 0)
	{
		r *= b ;            //81 = 3*3*3*3
		--e;
	}
	System.out.println("Answer is: "+r);
 }		
}