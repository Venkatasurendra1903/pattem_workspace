package selenium.webdriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstProgram 
{
	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws Exception
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Venkata.Pattem.ACS\\OneDrive - ACS Solutions\\Desktop\\driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();         //invoke the browser
		
		
//		driver.get("https://demoqa.com/text-box");  //open the URL in the browser
//		driver.findElement(By.id("userName")).sendKeys("surendra");
//		driver.findElement(By.id("userEmail")).sendKeys("surendra@gmail.com");
//		driver.findElement(By.id("currentAddress")).sendKeys("Chennai");
//		driver.findElement(By.id("permanentAddress")).sendKeys("AP");
//		driver.findElement(By.id("submit")).click();
//		Thread.sleep(3000);
//		driver.quit();
		
		
		driver.get("https://www.saucedemo.com/");
		driver.findElement(By.name("user-name")).sendKeys("standard_user");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.cssSelector("input[id=password]")).sendKeys("secret_sauce");
		driver.findElement(By.name("login-button")).click();
		String exptitle = "Swag Labs";
		String acttitle = driver.getTitle();
		if(exptitle.equals(acttitle))
		{
			System.out.println("test is passed");
		}
		else
		{
			System.out.println("test is failed");
		}
		
		Thread.sleep(3000);
		driver.quit();

	}

}
