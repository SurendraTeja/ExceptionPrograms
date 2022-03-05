import java.util.Scanner;
class Code5
{
	public static void main(String[] args)
	{	
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter 2 Numbers for Divison");
		try
		{
			int a=scan.nextInt();
			int b=scan.nextInt();
			int c=a/b;
			System.out.println("Divison is :"+c);
		}
		catch(Exception e)
		{
			System.out.println("Exception : Invalid Input");
			System.out.println("Exception : Enter Integers Only");
			System.out.println("Exception : Denaminator  Should Not ne Zero");
		}
		finally
		{
			System.out.println("Finally Block");
		}
	}
}