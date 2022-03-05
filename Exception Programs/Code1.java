import java.util.Scanner;
import java.util.InputMismatchException;
class Code1
{	
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter 2 Numbers for Addition");
		try
		{
			int a=scan.nextInt();
			int b=scan.nextInt();
			int c=a+b;
			System.out.println("Sum is :"+c);
		}
		catch(InputMismatchException  e)
		{
			System.out.println("Exception : Invalid Input");
			System.out.println("Exception : Enter integer Only");
		}
	}
}