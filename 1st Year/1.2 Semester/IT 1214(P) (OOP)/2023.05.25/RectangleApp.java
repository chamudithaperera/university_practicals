/*create a class Rectangle 
with private attributes width, height and
method findArea() and findPerimeter()
create another class RectangleApp
create a Reactangle object by passing width, height as 10,12
find the perimeter and area of the rectangle*/

class RectangleApp
{
	public static void main(String args[])
	{
		Rectangle ob = new Rectangle();
		ob.setWidth(10);
		ob.setHeight(12);
		System.out.println("Area of this rectangle : "+ob.findArea());
		System.out.println("perimeter of this rectangle : "+ob.findPerimeter());
	}
}
class Rectangle
{	private int width, height;
	
	public int getWidth() //getter for width
	{
		return width;
	}
	
	public void setWidth(int width) //setter for width
	{
		this.width = width;
	}
	
	public int getHeight() //getter for Height
	{
		return height;
	}
	
	public void setHeight(int height) //setter for Height
	{
		this.height=height;
	}
	
	public int findArea()
	{
		return width*height;
	}
	
	public int findPerimeter()
	{
		return 2*(width+height);
	}
}