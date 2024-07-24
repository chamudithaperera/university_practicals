class Square extends Rectangle{
	Square(){

	}

	Square(double width, double length, String color, boolean filled){
		super(width, length, color, filled);
	}

	Square(double width, String color, boolean filled){
		super(width, color, filled);
	}

	public double getSide(){
		return getWidth();
	}
	
	public void setSide(double width){
		super.setWidth(width);
	}
	
	public double getArea(){
		return getSide()*getSide();
	}
	
	public double getPerimeter(){
		return 4*getSide();
	}

	public String toString(){
		return "A Square with side = " + getSide() +", which is a subclass of Square";
	}
}
