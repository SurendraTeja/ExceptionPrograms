class Code4
{
	public static void main(String[] args)
	{
		try
		{
			String s="ab";
			int a=Integer.parseInt(s);
			System.out.println(a);
		}
		catch(NumberFormatException n)
		{	
			System.out.println("Exception : Converton Error");
		}
	}
}
		