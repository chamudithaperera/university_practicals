/*create a class rectangle
attributes length, width
method findarea, findperimeter
create a rectangle object by passing length and width values
*/
import java.util.Scanner;
class JavaConstructor3
{
	int length, width;
	
	
	
	public int findarea(int length, int width)
	{
		int area=length*width;
		return area;
	}
	public int findperimeter(int length, int width)
	{
		int perimeter=(2*length)+(2*width);
		return perimeter;
	}
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a value for length : ");
		int a = sc.nextInt();
		System.out.print("Enter a value for width : ");
		int b = sc.nextInt();
		JavaConstructor3 ob = new JavaConstructor3();
		
		System.out.println("Area of the rectangle is "+ob.findarea(a,b));
	
		System.out.println("Perimeter of the rectangle is "+ob.findperimeter(a,b));
	}
}