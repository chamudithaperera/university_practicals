class Array6
{
	public static void main(String args[])
	{
		int[] students={55,65,45,85,75};
		int sum=0;
		int largest=students[0];
		int smallest=students[0];
		
		for(int marks : students)
		{
			
			sum+=marks;
		}
		System.out.println("Sum of marks : "+sum);
		System.out.println("Average of marks : "+(sum/students.length));
		
		//find the largest number in ths array
		for(int i=0; i<students.length; i++)
		{
			if(largest<students[i])
			{
				largest=students[i];
			}
		}
		System.out.println("largest number is : "+largest);
		
		//find the smallerst number in ths array
		for(int i=0; i<students.length; i++)
		{
			if(smallest>students[i])
			{
				smallest=students[i];
			}
		}
		System.out.println("Smallerst number is : "+smallest);
	}
}