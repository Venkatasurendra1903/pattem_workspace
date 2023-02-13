package MMT;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScrollingAction {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		driver.manage().timeouts().pageLoadTimeout(10,TimeUnit.SECONDS);

		driver.manage().window().maximize();
		driver.findElement(By.xpath("//span[@class='ic_circularclose_grey']")).click();
		WebElement depo=driver.findElement(By.xpath("//input[@id='departure']"));
		Actions act=new Actions(driver);
		act.moveToElement(depo).click().build().perform();
		Thread.sleep(4000);
		for(int i=1;i<=11;i++) {
			driver.findElement(By.xpath("//span[@role='button' and @aria-label='Next Month']")).click();
		}
		driver.findElement(By.xpath("//div[@class='DayPicker-Day' and @aria-label='Sun Feb 04 2024']//p[text()='4']")).click();
		Thread.sleep(3000);
		WebElement search=driver.findElement(By.xpath("//a[text()='Search']"));
//		driver.manage().timeouts().setScriptTimeout(3L, TimeUnit.SECONDS);
//		Actions act=new Actions(driver);
//		act.moveToElement(search).click().build().perform();
		search.click();
//		Thread.sleep(8000);
		try {
			
			WebElement refresh=driver.findElement(By.xpath("//button[text()='Refresh']"));
			if(refresh.isDisplayed()) {
				refresh.click();
			}
		}
		catch(NoSuchElementException e) {
			System.out.println("refresh button is not displayed");
		}
		JavascriptExecutor js=(JavascriptExecutor) driver;

		Thread.sleep(8000);
		driver.manage().timeouts().pageLoadTimeout(10L,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);

		driver.findElement(By.xpath("//button[text()='OKAY, GOT IT!']")).click();
	
		WebElement flight=driver.findElement(By.xpath("//p[text()='G8 323, G8 325']/ancestor::div[@class='makeFlex align-items-center gap-x-10 airline-info-wrapper']/following-sibling::div[@class='priceSection']/descendant::button"));
		js.executeScript("window.scrollTo(arguments[0],arguments[1])",flight.getLocation().x,flight.getLocation().y);
		js.executeScript("arguments[0].click()",flight);

		
//		WebElement price=driver.findElement(By.xpath("//p[text()='₹ 8,440']/parent::div[@class='textRight flexOne']/following-sibling::button"));
//		price.click();
		WebElement book=driver.findElement(By.xpath("//p[text()='₹ 17,410']/parent::div[@class='viewFareBtnCol ']/button"));
		book.click();
		
		
//		Actions act =new Actions(driver);
//		act.moveToElement(flight).click().build().perform();
		
//		flight.click();
		

	}

}
