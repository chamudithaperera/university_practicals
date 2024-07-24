/*Count Number Digits in an Integer using while loop*/
class MyMain
{ public static void main(String args[])
  {
	int c=0, num=0003452;

    while(num != 0)
    {
	  num /=10;
	  ++c;
    }
    System.out.println("Number of Digits: "+c);
 }		
}