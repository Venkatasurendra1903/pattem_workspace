package File_handling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;

public class FileCreating_M1 {

	public static void main(String[] args) throws IOException 
	{
		File Obj = new File("C:\\suri.txt");

		try
		{
			if (Obj.createNewFile()) 
			{
				System.out.println("file is created");
			} 
			else
			{
				System.out.println("file already exists");
			}
		} 
		catch (IOException e) 
		{
			System.out.println("some errors occured");
			System.out.println(e.getMessage());
			System.out.println(e);
			e.printStackTrace();
		}
		FileWriter wr = new FileWriter("C:\\suri.txt",true);
		wr.write("goog good"+"\n");
		wr.close();		//you need to close the method for storing the data---> it is only for FileWriter.
		FileInputStream f = new FileInputStream("C:\\suri.txt");
		int b;
		while((b=f.read()) != -1) {
			System.out.print((char) b);
			
		}
		try {
				if(Obj.delete()) {
					System.out.println("the deleted file is:"+Obj.getName());
				}
				else {
					System.out.println("failed in deleting the file.");
				}
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}

}
