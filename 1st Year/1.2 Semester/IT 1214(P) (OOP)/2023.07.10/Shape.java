class Shape{
	private String color;
	private boolean filled;

	Shape(){
		this.color = "red";
		this.filled = true;
	}

	Shape(String color, boolean filled){
		this.color = color;
		this.filled = filled;
	}

	public String getColor(){
		return color;
	}

	public void setColor(String color){
		this.color = color;
	}

	public boolean getFilled(){
		return filled;
	}

	public void setFilled(boolean filled){
		this.filled = filled;
	}

	public String toString(){
		if(filled == true){
			return "A Shape with color " + color + " and filled";
		}else{
			return "A Shape with color " + color + " and not filled";
		}
	}
}