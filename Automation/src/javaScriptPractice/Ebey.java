package javaScriptPractice;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ebey {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Venkata.Pattem.ACS\\OneDrive - ACS Solutions\\Desktop\\driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.ebay.com/");
		driver.findElement(By.name("_nkw")).sendKeys("one plus 5g mobiles");
		driver.findElement(By.xpath("//input[@value='Search']")).click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		long x = (long) js.executeScript("return document.body.scrollHeight");
		System.out.println(x);
		js.executeScript("window.scrollTo(0,450)");		
		Thread.sleep(1000);
		for(int i=0; i<=20;i++)
		{
			
			js.executeScript("window.scrollBy(0,450)");
			Thread.sleep(500);
		}
		String parent = driver.getWindowHandle();
		driver.findElement(By.xpath("//*[@id=\"srp-river-results\"]/ul/li[20]/div/div[2]/a/div/span")).click();
		Set<String> s = driver.getWindowHandles();
		System.out.println(s);
		for(String i :s)
		{
			if(!i.equals(parent))
			{
				driver.switchTo().window(i);	
			}
		}
//		driver.quit();
		Thread.sleep(3000);
		String list = driver.findElement(By.xpath("//h1[@class='x-item-title__mainTitle']")).getText();
		System.out.println(list);
//		driver.findElement(By.xpath("//*[@id=\"srp-river-results\"]/ul/li[21]/div/div[2]/a/div/span")).click();
	}

}
