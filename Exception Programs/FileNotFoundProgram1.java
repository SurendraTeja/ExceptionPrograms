import java.io.FileNotFoundException;
import java.io.FileInputStream;
import java.io.IOException;
class FileNotFoundProgram1
{
	public static void main(String[] args)
	{
		FileInputStream file=null;
		try
		{	
			file=new FileInputStream("d:/file.txt");
			System.out.println("File Opened.........");
		}
		catch(FileNotFoundException f)
		{
			System.out.println("Exception : File not found......");
		}
		finally
		{	
			if(file!=null)
			{
				try
				{
					file.close();
					System.out.println("File Closed Successfully.......");
				}
				catch(IOException i)
				{
					System.out.println("Exception : IOException.......");
				}
			}
		}
	}
}