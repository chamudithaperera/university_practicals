class MyMain
{ public static void main(String args[])
 {
	String s = "Radar", rs = "";       //s= string rs=ReverseString
	
	int sl = s.length();           //l =StringLength 
	
	for(int i = (sl-1); i>=0; --i)
	{
		rs = rs +s.charAt(i);
		System.out.println(rs);
	}
	if(s.toLowerCase().equals(rs.toLowerCase()))
	{
		System.out.println(s+" is a palindrome String");
	}
	else
	{
		System.out.println(s+" is not a palindrome String");
	}
 }		
}