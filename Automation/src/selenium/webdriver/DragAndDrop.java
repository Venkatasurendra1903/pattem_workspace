package selenium.webdriver;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop 
{
	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException 
	{	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Venkata.Pattem.ACS\\OneDrive - ACS Solutions\\Desktop\\driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		driver.switchTo().frame(0);
		Actions action = new Actions(driver);
		
//Method 1 for drag & drop 
//		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
//		WebElement a = driver.findElement(By.xpath("//*[@id=\'draggable\']"));
//		WebElement b = driver.findElement(By.xpath("//*[@id=\'droppable\']"));
//		System.out.println("hello");
//		action.dragAndDrop(a, b).build().perform();
		
// Method 2 for drag & drop 
		
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		action.clickAndHold(driver.findElement(By.xpath("//*[@id=\"draggable\"]"))).moveToElement(driver.findElement(By.id("droppable"))).release().build().perform();
		
		
	
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		
		WebElement a = driver.findElement(By.xpath("//*[@id=\"box5\"]"));
		WebElement b = driver.findElement(By.xpath("//*[@id=\"box105\"]"));
		action.dragAndDrop(a, b).build().perform();
		
		Thread.sleep(2000);
		WebElement a1 = driver.findElement(By.xpath("//*[@id=\"box6\"]"));
		WebElement b1 = driver.findElement(By.xpath("//*[@id=\"box106\"]"));
		action.dragAndDrop(a1, b1).build().perform();
		
		Thread.sleep(2000);
		WebElement a2 = driver.findElement(By.xpath("//*[@id=\"box7\"]"));
		WebElement b2 = driver.findElement(By.xpath("//*[@id=\"box107\"]"));
		action.dragAndDrop(a2, b2).build().perform();
		
		Thread.sleep(2000);
		WebElement a3 = driver.findElement(By.xpath("//*[@id=\"box1\"]"));
		WebElement b3 = driver.findElement(By.xpath("//*[@id=\"box101\"]"));
		action.dragAndDrop(a3, b3).build().perform();
		
		Thread.sleep(2000);
		WebElement a4 = driver.findElement(By.xpath("//*[@id=\"box2\"]"));
		WebElement b4 = driver.findElement(By.xpath("//*[@id=\"box102\"]"));
		action.dragAndDrop(a4, b4).build().perform();
		
		Thread.sleep(2000);
		WebElement a5 = driver.findElement(By.xpath("//*[@id=\"box3\"]"));
		WebElement b5 = driver.findElement(By.xpath("//*[@id=\"box103\"]"));
		action.dragAndDrop(a5, b5).build().perform();
		
		Thread.sleep(2000);
		WebElement a6 = driver.findElement(By.xpath("//*[@id=\"box4\"]"));
		WebElement b6 = driver.findElement(By.xpath("//*[@id=\"box104\"]"));
		action.dragAndDrop(a6, b6).build().perform();
		
		driver.quit();
	}

}
