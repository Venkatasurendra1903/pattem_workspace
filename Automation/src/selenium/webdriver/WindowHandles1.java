package selenium.webdriver;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandles1 
{
	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Venkata.Pattem.ACS\\OneDrive - ACS Solutions\\Desktop\\driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		String parentHandle = driver.getWindowHandle();		//to get that specified window path
		System.out.println("parent window"+ parentHandle);
		driver.findElement(By.id("newWindowBtn")).click();
		Set<String> childHandle = driver.getWindowHandles();	//to get multiple window paths
		for(String i: childHandle)
		{
			System.out.println("all windows "+ i);
			if(!i.equals(parentHandle))
			{
				driver.switchTo().window(i);		//switch to parent to child window
				driver.findElement(By.id("firstName")).sendKeys("suri");
				Thread.sleep(3000);		//wait 3 sec
				driver.close();			// close this window
			}
			
		}
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.switchTo().window(parentHandle);		// switch from child to parent window
		driver.findElement(By.id("name")).sendKeys("parent");
		Thread.sleep(3000);
		driver.quit();
	}

}
