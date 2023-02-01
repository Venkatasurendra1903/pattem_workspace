package selenium.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Whatsapp 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Venkata.Pattem.ACS\\OneDrive - ACS Solutions\\Desktop\\driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 
		driver.get("https://web.whatsapp.com/");
//		Thread.sleep(5000);
//		driver.findElement(By.xpath("//*[@id=\"side\"]/div[1]/div/div/div[2]/div/div[2]")).click();
//		Thread.sleep(5000);
//		driver.findElement(By.xpath("//div[@class=\"_13NKt copyable-text selectable-text\"]")).sendKeys("sss");
//		Thread.sleep(5000);
		Thread.sleep(50000);
//		driver.findElement(By.xpath("//*[@id=\"side\"]/div[1]/div/div/div[2]/div/div[2]")).sendKeys("sss");

		driver.findElement(By.xpath("//*[@id=\"pane-side\"]/div[1]/div/div/div[8]/div/div/div/div[2]/div[1]/div[1]/span")).click();
		for(int i=0;i<=100;i++)
		{
			driver.findElement(By.xpath("//*[@id=\"main\"]/footer/div[1]/div/span[2]/div/div[2]/div[1]")).sendKeys("you");
			driver.findElement(By.xpath("//span[@data-icon=\"send\"]")).click();
		}
//		driver.findElement(By.xpath("//*[@id=\"main\"]/footer/div[1]/div/span[2]/div/div[2]/div[1]/div/div[1]/p")).click();
//		driver.findElement(By.xpath("//*[@id=\"main\"]/footer/div[1]/div/span[2]/div/div[2]/div[1]/div/div[1]")).sendKeys("hi");
		
	}

}
