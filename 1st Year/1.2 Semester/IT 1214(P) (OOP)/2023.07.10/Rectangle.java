class Rectangle extends Shape{
	protected double width;
	protected double length;

	Rectangle(){
		this.width = 1;
		this.length = 1;
	}

	Rectangle(double width, double length){
		this.width = width;
		this.length = length;
	}

	Rectangle(double width, double length, String color, boolean filled){
		super(color, filled);
		this.width = width;
		this.length = length;
	}

	Rectangle(double width, String color, boolean filled){
		super(color, filled);
		this.width = width;
	}

	public double getWidth(){
		return width;
	}

	public void setWidth(double width){
		this.width = width;
	}

	public double getLength(){
		return length;
	}

	public void setLength(double length){
		this.length = length;
	}

	public double getArea(){
		return width*length;
	}

	public double getPerimeter(){
		return 2*(width + length);
	}

	public String toString(){
		return "A Rectangle with width = " + width + " and length = " + length + ", which is a subclass of " + super.toString();
	}

}