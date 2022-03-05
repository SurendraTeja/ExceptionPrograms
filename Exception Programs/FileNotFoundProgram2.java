import java.io.FileNotFoundException;
import java.io.FileInputStream;
import java.io.IOException;
class FileNotFoundProgram2
{
	public static void main(String[] args)throws Exception
	{	
		FileInputStream file=null;
		try
		{
			
			file =new FileInputStream("d:/file.txt");
			System.out.println("File Opend..........");
		}
		finally
		{
			if(file!=null)
			{	
				file.close();
				System.out.println("File Closed Successfully.........");
			}
		}
	}
}