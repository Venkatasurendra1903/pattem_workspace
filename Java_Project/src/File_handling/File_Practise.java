package File_handling;

import java.io.File;
//import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class File_Practise {

	public static void main(String[] args) {
		File f=new File("C:\\hp.txt");
		try {
			if(f.createNewFile())
			{
				System.out.println("file created");
			}
			else {
				System.out.println("file already exists");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		FileOutputStream f2=null;
		try {
			f2 = new FileOutputStream("C:\\hp.txt",true);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		String h="i love batman";
		byte[] b=h.getBytes();
		try {
			f2.write(b);
		} catch (IOException e) {
			e.printStackTrace();
		}
		FileWriter wr=null;
		try {
			wr = new FileWriter("C:\\hp.txt",true);
			wr.write("i will kill you "+"\n");
			wr.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	
		

	}

}
