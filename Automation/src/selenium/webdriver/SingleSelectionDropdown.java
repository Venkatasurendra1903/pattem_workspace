package selenium.webdriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SingleSelectionDropdown 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Venkata.Pattem.ACS\\OneDrive - ACS Solutions\\Desktop\\driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");
		WebElement wb = driver.findElement(By.id("course")); 		//store the all values in dropdown in wb
		Select s = new Select(wb);
		List<WebElement> lwe = s.getOptions();
		for(WebElement i : lwe)
		{
			System.out.println(i.getText());		// ger the all dropdown values using for each loop
		}
		s.selectByIndex(2);
		Thread.sleep(3000);
		
		s.selectByValue("js");
		Thread.sleep(3000);
		
		s.selectByVisibleText("Python");
		Thread.sleep(3000);
		driver.quit();
	}

}
