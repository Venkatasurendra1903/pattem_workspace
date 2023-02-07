package MMT;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MMT_Sliding {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div[2]/div/span")).click();
		Thread.sleep(2000);
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("window.scrollTo(0,50)");
		driver.findElement(By.xpath("//a[text()='Search']")).click();
		Thread.sleep(3000);
		Actions act=new Actions(driver);
		Thread.sleep(2000);
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		WebElement slider=driver.findElement(By.xpath("//div[@class='rangeslider__handle']"));
//		act=new Actions(driver);
		act.moveToElement(slider).click().build().perform();
		Thread.sleep(3000);
		act.moveToElement(slider).dragAndDropBy(slider,-140,0).build().perform();
		Thread.sleep(3000);
		act.moveToElement(slider).dragAndDropBy(slider,-100,0).build().perform();
		Thread.sleep(3000);
		act.moveToElement(slider).dragAndDropBy(slider,250,0).build().perform();
		Thread.sleep(3000);
		act.moveToElement(slider).dragAndDropBy(slider,-250,0).build().perform();
		Thread.sleep(2000);
		driver.manage().window().minimize();
		Thread.sleep(2000);
		driver.quit();

	}

}
