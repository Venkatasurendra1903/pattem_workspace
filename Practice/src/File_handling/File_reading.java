package File_handling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class File_reading {

	public static void main(String[] args) throws Exception
	{
		FileInputStream fis = null;
		try
		{
			File Obj = new File("C:\\suri.txt");
			fis = new FileInputStream(Obj);
			int c = 0;
			while((c = fis.read()) != -1)
			{
				System.out.print((char) c);
			}
		} 
		catch (FileNotFoundException e)
		{
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		finally
		{
			try 
			{
				fis.close();
			} 
			catch (IOException e) 
			{
				e.printStackTrace();
			}
		}
		
	}

}
