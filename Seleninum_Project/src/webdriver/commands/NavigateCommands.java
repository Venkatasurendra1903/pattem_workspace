package webdriver.commands;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateCommands 
{
	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Venkata.Pattem\\\\eclipse-workspace\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		System.out.println(driver.getTitle());
		driver.navigate().to("https://www.saucedemo.com/");
		System.out.println(driver.getTitle());
		driver.navigate().back();
		System.out.println(driver.getTitle());
		driver.navigate().forward();
		System.out.println(driver.getTitle());
		driver.navigate().refresh();
		System.out.println(driver.getTitle());
		Thread.sleep(3000);
		driver.quit();
	}

}
