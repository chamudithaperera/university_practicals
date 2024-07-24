public class Book
{
	private String name;
	private double price;
	private int quantity;
	private Author author;
	
	public Book(String name, double price, Author author)
	{
		this.name=name;
		this.author=author;
		this.price=price;
		this.quantity=0;
	}
	
	public Book(String name, double price, Author author, int quantity)
	{
		
	}
	
	
	public String getName()
	{
		return this.name;
	}
	
	public double getPrice()
	{
		return this.price;
	}
	
	public int getQuantity()
	{
		return this.gender;
	}
	
	public void setPrice(double price)
	{
		this.price=price;
	}
	
	public void setQuantity(int quantity)
	{
		this.quantity=quantity;
	}
	
	
}