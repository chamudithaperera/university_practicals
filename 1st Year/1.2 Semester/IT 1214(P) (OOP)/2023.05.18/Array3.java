//2 dimensial array
class Array3
{
	public static void main(String args[])
	{
		//create a 2d array
		int[][] a={{1,-2,3},{-4,-5,6,9},{7}};
		
		for(int[] innerArray: a)
		{
			for(int data: innerArray)
			{
				System.out.println(data);
			}
		}
		
	}
}