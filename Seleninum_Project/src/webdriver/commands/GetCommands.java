package webdriver.commands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCommands 
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Venkata.Pattem\\\\eclipse-workspace\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		System.out.println("the title is:");
		System.out.println(driver.getTitle());
		System.out.println("the URL is:");
		System.out.println(driver.getCurrentUrl());
		String text = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div/div[2]/h4")).getText();
		System.out.println(text);
		driver.quit();
	}

}
//*[@id="login-button"]