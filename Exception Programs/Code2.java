import java.util.Scanner;
import java.util.InputMismatchException;
class Code2
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
		catch(InputMismatchException e)
		{
			System.out.println("Exception : Invalid Input");
			System.out.println("Exception : Enter Integers Only");
		}
		catch(ArithmeticException a)
		{
			System.out.println("Exception : Denaminator  Should Not ne Zero");
		}
	}
}