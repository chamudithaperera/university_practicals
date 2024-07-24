import java.util.*;

class ShapeDemo{
	public static void main(String[] args){

		Scanner scn = new Scanner(System.in);
		
		System.out.println("\tShape");
		System.out.print("Enter Color : ");
		String shape1Color = scn.next();
		System.out.print("Filled (true or false) : ");
		String shape1Fill = scn.next();	
		boolean isShapeFill  = true;	
		if(shape1Fill.toUpperCase().equals("TRUE")){
			isShapeFill = true;
		}else if(shape1Fill.toUpperCase().equals("FALSE")){
			isShapeFill = false;
		}else{
			System.out.println("Enter Wrong!");
		}
		Shape s1 = new Shape(shape1Color, isShapeFill);
		
		System.out.println("\n\tCircle 1");	
		System.out.print("Enter Radius : ");
		double circle1Radius = scn.nextDouble();	
		System.out.print("Enter Color : ");
		String circle1Color = scn.next();	
		System.out.print("Filled (true or false) : ");
		String circle1Fill = scn.next();	
		boolean isCircle1Fill  = true;
		if(circle1Fill.toUpperCase().equals("TRUE")){
			isCircle1Fill = true;
		}else if(circle1Fill.toUpperCase().equals("FALSE")){
			isCircle1Fill = false;
		}else{
			System.out.println("Enter Wrong!");
		}
		
		System.out.println("\n\tCircle 2");
		System.out.print("Enter Radius : ");
		double circle2Radius = scn.nextDouble();
		System.out.print("Enter Color : ");
		String circle2Color = scn.next();
		System.out.print("Filled (true or false) : ");
		String circle2Fill = scn.next();
		boolean isCircle2Fill = true;
		if(circle2Fill.toUpperCase().equals("TRUE")){
			isCircle2Fill = true;
		}else if(circle2Fill.toUpperCase().equals("FALSE")){
			isCircle2Fill = false;
		}else{
			System.out.println("Enter Wrong!");
		}
		
		Circle c1 = new Circle(circle1Radius, circle1Color, isCircle1Fill);
		Circle c2 = new Circle(circle2Radius, circle2Color, isCircle2Fill);
		
		System.out.println("\n\tRectangle 1");
		System.out.print("Enter Width : ");
		double rectangle1Width = scn.nextDouble();
		System.out.print("Enter Length : ");
		double rectangle1Length = scn.nextDouble();
		System.out.print("Enter Color : ");
		String rectangle1Color = scn.next();
		System.out.print("Filled (true or false) : ");
		String rectangle1Fill = scn.next();
		boolean isrectangle1Fill = true;
		if(rectangle1Fill.toUpperCase().equals("TRUE")){
			isrectangle1Fill = true;
		}else if(rectangle1Fill.toUpperCase().equals("FALSE")){
			isrectangle1Fill = false;
		}else{
			System.out.println("Enter Wrong!");
		}
		
		System.out.println("\n\tRectangle 2");
		System.out.print("Enter Width : ");
		double rectangle2Width = scn.nextDouble();
		System.out.print("Enter Length : ");
		double rectangle2Length = scn.nextDouble();
		System.out.print("Enter Color : ");
		String rectangle2Color = scn.next();
		System.out.print("Filled (true or false) : ");
		String rectangle2Fill = scn.next();
		boolean isrectangle2Fill = true;
		if(rectangle2Fill.toUpperCase().equals("TRUE")){
			isrectangle2Fill = true;
		}else if(rectangle2Fill.toUpperCase().equals("FALSE")){
			isrectangle2Fill = false;
		}else{
			System.out.println("Enter Wrong!");
		}
		
		System.out.println("\n\tSquare");
		System.out.print("Enter Length : ");
		double sqWidth = scn.nextDouble();
		System.out.print("Enter Color : ");
		String sqColor = scn.next();
		System.out.print("Filled (true or false) : ");
		String sqFill = scn.next();
		boolean isSqFill = true;
		if(rectangle2Fill.toUpperCase().equals("TRUE")){
			isSqFill = true;
		}else if(rectangle2Fill.toUpperCase().equals("FALSE")){
			isSqFill = false;
		}else{
			System.out.println("Enter Wrong!");
		}
		
		Rectangle r1 = new Rectangle(rectangle1Width, rectangle1Length, rectangle1Color, isrectangle1Fill);
		Rectangle r2 = new Rectangle(rectangle2Width, rectangle2Length, rectangle2Color, isrectangle2Fill);
		
		Square sq = new Square(sqWidth, sqColor, isSqFill);
		
		System.out.println("\nShape Color : " + s1.getColor());
		System.out.println("Shape Filled : " + s1.getFilled());
		
		System.out.println("\n\tCircle1\nCircle Radius : " + c1.getRadius());
		System.out.println("Circle color : " + c1.getColor());
		System.out.println("Circle Filled : " + c1.getFilled());
		System.out.println("Circle Area : " + c1.getArea());
		System.out.println("Circle Perimeter : " + c1.getPerimeter());

		System.out.println("\n\tCircle2\nCircle Radius : " + c2.getRadius());
		System.out.println("Circle color : " + c2.getColor());
		System.out.println("Circle Filled : " + c2.getFilled());
		System.out.println("Circle Area : " + c2.getArea());
		System.out.println("Circle Perimeter : " + c2.getPerimeter());
		
		System.out.println("\n\tRectangle1\nRectangle Width : " + r1.getWidth());
		System.out.println("Rectangle Length : " + r1.getLength());
		System.out.println("Rectangle color : " + r1.getColor());
		System.out.println("Rectangle Filled : " + r1.getFilled());
		System.out.println("Rectangle Area : " + r1.getArea());
		System.out.println("Rectangle Perimeter : " + r1.getPerimeter());
		
		System.out.println("\n\tRectangle2\nRectangle Width : " + r2.getWidth());
		System.out.println("Rectangle Length : " + r2.getLength());
		System.out.println("Rectangle color : " + r2.getColor());
		System.out.println("Rectangle Filled : " + r2.getFilled());
		System.out.println("Rectangle Area : " + r2.getArea());
		System.out.println("Rectangle Perimeter : " + r2.getPerimeter());
		
		System.out.println("\n\tSquare\nSquare Length : " + sq.getWidth());
		System.out.println("Rectangle color : " + sq.getColor());
		System.out.println("Rectangle Filled : " + sq.getFilled());
		System.out.println("Rectangle Area : " + sq.getArea());
		System.out.println("Rectangle Perimeter : " + sq.getPerimeter());
	}
}