class Ex02
{
	public static void main(String args[])
	{
		int num1, add, num2, sub=0, mult=0, mod;//Declaration of
		double div=0;
		
		num1=10; //initialization of variables
		num2=25;
		add=num1+num2;
		sub=num2-num1;
		mult=num1*num2;
		div=(double)num2/(double)num1;
		mod=num1%num2;
		
		//10+20=30
		//System.out.println(add); ///prints 30
		
		System.out.println(num1+" + "+num2+" = "+add);
		System.out.println(num2+" - "+num1+" = "+sub);
		System.out.println(num1+" * "+num2+" = "+mult);
		System.out.println(num2+" / "+num1+" = "+div);
		System.out.println(num1+" % "+num2+" = "+mod);
	
		
	}
}