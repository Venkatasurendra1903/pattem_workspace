package webdriver.commands;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ConditionalCommands 
{
	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Venkata.Pattem.ACS\\OneDrive - ACS Solutions\\Desktop\\driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
//		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']")).sendKeys("8639386590");
		driver.findElement(By.xpath("//input[@class='_2IX_2- _3mctLh VJZDxU']")).sendKeys("suri@1903");
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']")).click();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.linkText("Fashion"))).build().perform();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.linkText("Men Footwear")).click();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
//		action.moveToElement(driver.findElement(By.linkText("Men Footwear"))).build().perform();
//		action.moveToElement(driver.findElement(By.xpath("All"))).click().build().perform();
		Thread.sleep(3000);
		driver.manage().window().minimize();
		
		Thread.sleep(3000);
		driver.quit();
	}

}