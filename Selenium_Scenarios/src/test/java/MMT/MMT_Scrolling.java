package MMT;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MMT_Scrolling {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div[2]/div/span")).click();
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0,50)");
		driver.findElement(By.xpath("//a[text()='Search']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[2]/div/span")).click();
		js.executeScript("window.scrollTo(0,500)");
		Thread.sleep(3000);
		for(int i=0; i<=4;i++)
		{
			js.executeScript("window.scrollBy(0,250)");
			Thread.sleep(500);
		}
		String parent = driver.getWindowHandle();
		driver.findElement(By.xpath("//p[text()='₹ 5,241']/parent::div[@class='textRight flexOne']/following-sibling::button")).click();
		Thread.sleep(3000);

		

		
		
		driver.manage().window().minimize();
		Thread.sleep(2000);
		driver.quit();

	}

}
