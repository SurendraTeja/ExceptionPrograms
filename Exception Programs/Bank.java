import java.util.Scanner;
import java.util.InputMismatchException;
class LowBalanceException extends Exception
{
	LowBalanceException(String name)
	{
		super(name);
	}
}
class Account 
{
	int balance;
	Account(int balance)
	{
		this.balance=balance;
	}
	void withdraw(int amt)throws LowBalanceException
	{
		if(amt<=balance)
		{
			System.out.println("Collect Cash :"+amt);
			this.balance=this.balance-amt;
		}
		else
		{
			LowBalanceException obj=new LowBalanceException("Low Balance");
			throw obj;
		}
	}
}
class Bank
{
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		try
		{
			System.out.println("Enter input Balance");
			int amt=scan.nextInt();
			Account acc=new Account(amt);
			System.out.println("Balance is :"+acc.balance);
			System.out.println("Enter Withdraw Ammount");
			int withAmt=scan.nextInt();
			try
			{
				acc.withdraw(withAmt);
			}
			catch(LowBalanceException e)
			{
				System.out.println("Exception :"+ e.getMessage());
			}
			System.out.println("Final Balance is :"+acc.balance);
		}
		catch(InputMismatchException i)
		{
			System.out.println("Exception : Invalid Input"); 
			System.out.println("Exception : Enter Amount in Integer");
		}	
	}
}