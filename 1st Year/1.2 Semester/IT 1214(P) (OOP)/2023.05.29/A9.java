class A9
{ public static void main(String args[])
 {
	int num = 3553, rn = 0, r;              //rn =reverse number          r = remainder
	
	int onum = num;      //onum = OriginalNumber
	
	while(num!=0)
	{
		r = num%10;
		rn = rn *10 +r;
		num /=10;
	}
	
	if(onum == rn)
	{
		System.out.println(onum+" is a palindrome ");
	}
	else
	{
		System.out.println(onum+" is a palindrome ");
	}
	
 }		
}