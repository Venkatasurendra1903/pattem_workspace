package File_handling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadingFileUsingBuffurReader {

	public static void main(String[] args) throws IOException 
	{
		
//1---> read the file using bufferreader		
//		BufferedReader br = null;
//		try
//		{
//			File Obj = new File("C:\\suri.txt");
//			br = new BufferedReader(new FileReader(Obj));
//			System.out.println("file content is:");
//			int c = 0;
//			while((c = br.read()) != -1)
//			{
//				System.out.print((char) c);
//			}
//		} 
//		catch (Exception e)
//		{
//			System.out.println(e.getMessage());
//			e.printStackTrace();
//		}
//		finally
//		{
//			try 
//			{
//				br.close();
//			} 
//			catch (IOException e) 
//			{
//				e.printStackTrace();
//			}
//		}
		
//2---> read the file using only Filereader	
		
		FileReader fr = null;
		try
		{
			File Obj = new File("C:\\suri.txt");
			fr = new FileReader(Obj);
			System.out.println("file content is:");
			int c = 0;
			while((c = fr.read()) != -1)
			{
				System.out.print((char) c);
			}
		} 
		catch (Exception e)
		{
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		finally
		{
			try 
			{
				fr.close();
			} 
			catch (IOException e) 
			{
				e.printStackTrace();
			}
		}
	}

}
