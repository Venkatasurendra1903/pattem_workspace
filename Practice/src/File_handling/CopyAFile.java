package File_handling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class CopyAFile {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException {

		FileInputStream fis = null;
		FileOutputStream fos = null;
		try 
		{
			fis = new FileInputStream("C:\\suri.txt");
			fos = new FileOutputStream("C:\\suri-copy.txt");
			int c;
			while((c = fis.read()) != -1)	//read the data from the fis and store that data into 'c' and write that data in fos!!
			{	
				fos.write(c);
			}
			System.out.println("file copied successfully!");
		} 
		catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		}
		finally 
		{
			if(fis != null) 
			{
				fis.close();
			}
			if(fos != null)
			{
				fos.close();
			}
		}
		//read the data from file
		FileInputStream f1 = new FileInputStream("C:\\suri-copy.txt");//C:\Users\Venkata.Pattem.ACS\OneDrive - ACS Solutions\Desktop
		int d;
		while((d = f1.read()) != -1) {	//read the data from the f1 and store into 'd'
			System.out.print((char) d); // print that data into console
		}
		//write the new data into file
		FileWriter wr=new FileWriter("C:\\suri4-copy.txt",true);	// write additional data
		wr.write("i will kill you ");
		wr.close();	//to store that data, need to close it.
		System.out.println("successfully written");
		FileOutputStream f2=new FileOutputStream("C:\\suri4.txt",true);
		String h="i love batman";
		byte[] b=h.getBytes();
		f2.write(b);
		f2.close();		
		
	}

}
