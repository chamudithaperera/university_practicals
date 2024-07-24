class  Javainputex02
{
	public static void main(String number[])
	{
		Double num1, num2; //int num1, num2
		num1=Double.parseDouble(number[0]);
		num2=Double.parseDouble(number[1]);
		//num1=Interger.parseInt(number[0]);
		
		System.out.println(num1+" + "+num2+" = "+(num1+num2));
		System.out.println(num1+" - "+num2+" = "+(num1-num2));
		System.out.println(num1+" / "+num2+" = "+(num1/num2));
		System.out.println(num1+" * "+num2+" = "+(num1*num2));
	}
}