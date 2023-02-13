package MMT;

import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MMT_Scrolling {

	public static void main(String[] args) throws Exception {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div[2]/div/span")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div[1]/div[3]/label/span")).click();
		Thread.sleep(2000);
		for(int i=1;i<=11;i++) {
			driver.findElement(By.xpath("//span[@role='button' and @aria-label='Next Month']")).click();
		}
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='DayPicker-Day' and @aria-label='Tue Feb 06 2024']//p[text()='6']")).click();
		driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
		Actions act = new Actions(driver);
		act.moveToElement(driver.findElement(By.xpath("//a[text()='Search']"))).click().build().perform();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[2]/div/span")).click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0,250)");
		Thread.sleep(3000);
		for(int i=0; i<=3;i++)
		{
			js.executeScript("window.scrollBy(0,200)");
			Thread.sleep(500);
		}
		WebElement price =  driver.findElement(By.xpath("//p[text()='AI 504']/ancestor::div[@class='makeFlex align-items-center gap-x-10 airline-info-wrapper']/following-sibling::div[@class='priceSection']/descendant::button"));
		act.moveToElement(price).click().build().perform();
		driver.findElement(By.xpath("//p[text()='₹ 6,344']/parent::div[@class='viewFareBtnCol ']/button")).click();
		Thread.sleep(3000);
		String parentHandle = driver.getWindowHandle();
		System.out.println("the parent window is:"+parentHandle);
		Set<String> Handles = driver.getWindowHandles();
		System.out.println(Handles);
		for(String handle : Handles) {
			if(!handle.equals(parentHandle)) {
				driver.switchTo().window(handle);
			}
		}
		WebElement aa = driver.findElement(By.xpath("//b[text()='New Delhi → Bengaluru']"));
		System.out.println("the text from the new window is:\n"+aa);
		WebElement location = driver.findElement(By.xpath("//h2[text()='Traveller Details']"));
		System.out.println(location);
		js.executeScript("arguments[0].scrollIntoView(true);",location);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='+ ADD NEW ADULT']")).click();
		driver.findElement(By.xpath("//input[@placeholder='First & Middle Name']")).sendKeys("Venkat");
		driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("Surendra");
		driver.findElement(By.xpath("//label[@tabindex='0']")).click();
		driver.findElement(By.xpath("//input[@placeholder='Mobile No']")).sendKeys("8639627628");
		driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("chandu@gmail.com");
		driver.findElement(By.xpath("//div[@class='emailIds-dropdown']/div")).click();
		Thread.sleep(3000);
		driver.manage().timeouts().pageLoadTimeout(10,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//button[text()='Continue']")).click();
		driver.findElement(By.xpath("//button[text()='CONFIRM']")).click();
		
		String PH = driver.getWindowHandle();
		System.out.println("the parent window is:"+PH);
		Set<String> H = driver.getWindowHandles();
		System.out.println(H);
		for(String h : H) {
			if(h.equals(PH)) {
				driver.switchTo().window(h);
			}
		}
		WebElement x = driver.findElement(By.xpath("//h2[text()='Complete your booking']"));
		System.out.println("the text from the new window is:\n"+x);
//		js.executeScript("window.scrollTo(0,1322)");
		Thread.sleep(2000);
		act.moveToElement(driver.findElement(By.xpath("//span[text()='No, Let Me Choose']"))).click().build().perform();
		
//		driver.quit();

	}
	
}
