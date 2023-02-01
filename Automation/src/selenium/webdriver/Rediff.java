package selenium.webdriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Rediff 
{
	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Venkata.Pattem.ACS\\OneDrive - ACS Solutions\\Desktop\\driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 
		driver.get("https://www.rediff.com//");
		driver.manage().timeouts().pageLoadTimeout(10,TimeUnit.SECONDS);
		driver.findElement(By.linkText("Sign in")).click(); 		//click on signin button
		driver.manage().window().maximize();
		driver.findElement(By.name("proceed")).click();			//click on signin button in another window
		// pop-up raised
		Thread.sleep(3000);
		System.out.println("You need to switch to pop-up window to cancel that window");
		Alert alert = driver.switchTo().alert();
		System.out.println("pop-up window opened");
		Thread.sleep(3000);
		alert.accept();		//close the pop-up notification
		Thread.sleep(3000);
		System.out.println("pop-up window closed");
		Thread.sleep(3000);
		driver.findElement(By.id("login1")).sendKeys("suri@123");		//pass the value in username box
		Thread.sleep(3000);
		System.out.println(driver.getTitle());  		//get the title of the page
		driver.manage().window().minimize();
		Thread.sleep(3000);
		driver.quit();

	}

}
