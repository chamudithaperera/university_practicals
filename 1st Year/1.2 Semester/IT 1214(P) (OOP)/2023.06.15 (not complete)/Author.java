public class Author
{
	private String name;
	private String email;
	private char gender;
	
	public Author(String name, String email, char gender)
	{
		this.name=name;
		this.email=email;
		this.gender=gender;
	}
	
	public String getName()
	{
		return this.name;
	}
	
	public String getEmail()
	{
		return this.email;
	}
	
	public chat getGender()
	{
		return this.gender;
	}
	
	public void setEmail(String email)
	{
		this.email=email;
	}
	
	public String toString()
	{
		retrun "\nAuthor Name : "+this.name+"\nEmail : "+this.email+"\nGender : "+this.gender;
	}
	
	
}

