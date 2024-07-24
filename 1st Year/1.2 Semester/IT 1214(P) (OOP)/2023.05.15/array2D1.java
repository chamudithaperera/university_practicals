class array2D1
{
	public static void main(String args[])
	{
		//declare and instantiate a 2D array
		double ARRAY_MARKS[][]=new double[4][3];
		
		//initialize
		double SALARY [][]={{5000.00,680.45,684.45},
						   {5000.00,680.45,684.45},
						   {5000.00,680.45,684.45}};
						 
		//print array
		for(int i=0; i<3; i++)
		{
			for(int j=0; j<3; j++)
			{
				System.out.print(SALARY [i][j]+" ");
			}
			System.out.print("\n");
			
		}
	}
}