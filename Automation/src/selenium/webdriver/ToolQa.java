package selenium.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToolQa 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Venkata.Pattem.ACS\\OneDrive - ACS Solutions\\Desktop\\driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/text-box");
		Thread.sleep(1000);
		driver.findElement(By.id("userName")).sendKeys("surendra");
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/form/div[2]/div[2]/input")).sendKeys("suri123@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.id("currentAddress")).sendKeys("nellore");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"permanentAddress\"]")).sendKeys("nellore");
		Thread.sleep(1000);
		driver.findElement(By.id("submit")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Check Box']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"tree-node\"]/ol/li/span/label")).click();
		Thread.sleep(3000);
		System.out.println("the check box is verified");
		driver.findElement(By.xpath("//span[text()='Radio Button']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//label[text()='Yes']")).click();
		System.out.println("the radio box coloumn is verified");
		Thread.sleep(3000);

		driver.quit();
	}

}
