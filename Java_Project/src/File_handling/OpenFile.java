package File_handling;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

public class OpenFile {

	public static void main(String[] args) 
	{
		File Obj = new File("C:\\suri.txt");
		if(!Desktop.isDesktopSupported())
		{
			System.out.println("deesktiop not supported");
			return;
		}
		Desktop desktop = Desktop.getDesktop();
		if(Obj.exists())
		{
			try 
			{
				desktop.open(Obj);
			} 
			catch (IOException e)
			{
				e.printStackTrace();
			}
		}


		
	}

}
