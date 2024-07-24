/*create a class BankAccount */
public class BankAccount
{
	private String accountNO;
	private double balance;
	
	public BankAccount(String accountNO, double balance)
	{
		this.accountNO=accountNO;
		thisbalance=balance;
	}
	public String getBalance()
	{
		return balance;
	}
	public void deposit(double amount)
	{
		balance+=amount;
	}
	public void withdraw(double amount)
	{
		if(balance>=amount)
		{
			balance-=amount;
		}
		else
		{
			System.out.println("Insuffient Balance");
		}
	}
	
	public static void main(String args[])
	{
		SavingAccount sal = new SavingAccount("SA10010",20000.00,500.00);
		sal.deposit(400);
		System.out.println("Minimum balance shoudl be Rs:50");
		
	}
	
}

public class SavingAccount extends BankAccount
{
	public SavingAccount(String accountNO, double balance)
	{
		super(accountNO,balance);
	}
	public void withdraw(double amount)
	{
		if(getBalance()-amount<500)
		{
			System.out.println("Minimum balance shoudl be Rs:50");
		}
		else
		{
			super.withdraw(amount);
		}
	}
}