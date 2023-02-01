package selenium.webdriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Instagram 
{
	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws Exception 
	{		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Venkata.Pattem.ACS\\OneDrive - ACS Solutions\\Desktop\\driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.instagram.com/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//span[text()='Sign up']")).click();
		driver.findElement(By.name("emailOrPhone")).sendKeys("suri123@gmail.com");
		driver.findElement(By.name("fullName")).sendKeys("Surendra");
		driver.findElement(By.xpath("//input[@name=\"username\"]")).sendKeys("surendra12345");
		driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys("123456789");
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/div/div/div/div[1]/section/main/div/div/div[1]/div[2]/form/div[7]/div")).click();
		
		
//		driver.findElement(By.name("username")).sendKeys("pattemsurendra123@gmail.com");
//		driver.findElement(By.name("password")).sendKeys("Suri@1903");
//		driver.findElement(By.xpath("//div[text()='Log in']")).click();
//		Thread.sleep(4000);
		driver.quit();
	}

}
