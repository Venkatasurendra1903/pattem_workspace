package webdriver.commands;

import java.util.List;
//import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTables 
{
	
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Venkata.Pattem.ACS\\OneDrive - ACS Solutions\\Desktop\\driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/webtables");		
		List<WebElement> rows = driver.findElements(By.xpath("//*[@id='app']/div/div/div[2]/div[2]/div[2]/div[3]/div[1]/div[2]/div"));
		int rowCount = rows.size();
		System.out.println("total rows in web table are:"+ rowCount);
		
		String beforeXpath = "//*[@id='app']/div/div/div[2]/div[2]/div[2]/div[3]/div[1]/div[2]/div[";
		String afterXpath = "]/div/div[1]";
		
		for(int i = 1 ; i <= rowCount ; i++)
		{
			String actualXpath = beforeXpath + i + afterXpath;
			WebElement element = driver.findElement(By.xpath(actualXpath));
			System.out.println(element.getText());
			if(element.getText().equals("Cierra") && element.getText().equals("Kierra"))
			{
				System.out.println("the 'Cierra' is found at "+ i + " position" );
				System.out.println("the 'Kierra' is found at "+ i + " position" );
				break;
			}
		}
		
		System.out.println("*******");
		
		String afterXpathLN = "]/div/div[2]";
		for(int i = 1 ; i <= rowCount ; i++)
		{
			String actualXpath = beforeXpath + i + afterXpathLN;
			WebElement element = driver.findElement(By.xpath(actualXpath));
			System.out.println(element.getText());
		}
		
		
		System.out.println("*********");
		
		String afterXpathAge = "]/div/div[3]";
		for(int i = 1 ; i <= rowCount ; i++)
		{
			String actualXpath = beforeXpath + i + afterXpathAge;
			WebElement element = driver.findElement(By.xpath(actualXpath));
			System.out.println(element.getText());
		}
		
		System.out.println("*****");
		String afterXpathMail = "]/div/div[4]";
		for(int i = 1 ; i <= rowCount ; i++)
		{
			String actualXpath = beforeXpath + i + afterXpathMail;
			WebElement element = driver.findElement(By.xpath(actualXpath));
			System.out.println(element.getText());
		}
// printing coloumn values in the web table
		
		String colBeforeXpath = "//*[@id=\"app\"]/div/div/div[2]/div[2]/div[2]/div[3]/div[1]/div[1]/div/div[";
		String colAfterXpath = "]/div[1]";
		List<WebElement> cols = driver.findElements(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[2]/div[2]/div[3]/div[1]/div[1]/div/div"));
		int colCount = cols.size();
		System.out.println("the no of coloumns in the web table are:"+colCount);
		for(int i = 1 ; i <= colCount ; i++)
		{		
			String actualColXpath = colBeforeXpath + i +  colAfterXpath;
			WebElement element1 = driver.findElement(By.xpath(actualColXpath));
			System.out.println(element1.getText());
		}
		System.out.println();
		
		for(int i=1;i<=rowCount;i++) {
			for(int j=1;j<=colCount;j++) {
				WebElement s=driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[2]/div[2]/div[3]/div[1]/div[2]/div["+i+"]/div/div["+j+"]"));
				System.out.print(s.getText()+ " ");
			}
			System.out.println();
		}
		driver.quit();
	}

}

////xpaths for rows in coloumn 1

//*[@id="app"]/div/div/div[2]/div[2]/div[2]/div[3]/div[1]/div[2]/div[1]/div/div[1]
//*[@id="app"]/div/div/div[2]/div[2]/div[2]/div[3]/div[1]/div[2]/div[2]/div/div[1]
//*[@id="app"]/div/div/div[2]/div[2]/div[2]/div[3]/div[1]/div[2]/div[3]/div/div[1]
//*[@id="app"]/div/div/div[2]/div[2]/div[2]/div[3]/div[1]/div[2]/div[4]/div/div[1]
//*[@id="app"]/div/div/div[2]/div[2]/div[2]/div[3]/div[1]/div[2]/div[5]/div/div[1]

// xpaths for rows in coloumn 2

//*[@id="app"]/div/div/div[2]/div[2]/div[2]/div[3]/div[1]/div[2]/div[1]/div/div[2]
//*[@id="app"]/div/div/div[2]/div[2]/div[2]/div[3]/div[1]/div[2]/div[2]/div/div[2]
//*[@id="app"]/div/div/div[2]/div[2]/div[2]/div[3]/div[1]/div[2]/div[3]/div/div[2]

//xpaths for rows in coloumn 3
//*[@id="app"]/div/div/div[2]/div[2]/div[2]/div[3]/div[1]/div[2]/div[1]/div/div[3]
//*[@id="app"]/div/div/div[2]/div[2]/div[2]/div[3]/div[1]/div[2]/div[2]/div/div[3]
//*[@id="app"]/div/div/div[2]/div[2]/div[2]/div[3]/div[1]/div[2]/div[3]/div/div[3]


//xpaths for rows in coloumn 4
//*[@id="app"]/div/div/div[2]/div[2]/div[2]/div[3]/div[1]/div[2]/div[1]/div/div[4]
//*[@id="app"]/div/div/div[2]/div[2]/div[2]/div[3]/div[1]/div[2]/div[2]/div/div[4]


// xpaths for cols in row1

//*[@id="app"]/div/div/div[2]/div[2]/div[2]/div[3]/div[1]/div[1]/div/div[1]/div[1]
//*[@id="app"]/div/div/div[2]/div[2]/div[2]/div[3]/div[1]/div[1]/div/div[1]/div[1]
//*[@id="app"]/div/div/div[2]/div[2]/div[2]/div[3]/div[1]/div[1]/div/div[2]/div[1]
//*[@id="app"]/div/div/div[2]/div[2]/div[2]/div[3]/div[1]/div[1]/div/div[3]/div[1]
//*[@id="app"]/div/div/div[2]/div[2]/div[2]/div[3]/div[1]/div[1]/div/div[4]/div[1]
//*[@id="app"]/div/div/div[2]/div[2]/div[2]/div[3]/div[1]/div[1]/div/div[5]/div[1]
//*[@id="app"]/div/div/div[2]/div[2]/div[2]/div[3]/div[1]/div[1]/div/div[6]/div[1]
//*[@id="app"]/div/div/div[2]/div[2]/div[2]/div[3]/div[1]/div[1]/div/div[7]/div[1]
