package javaScriptPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Two {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Venkata.Pattem.ACS\\OneDrive - ACS Solutions\\Desktop\\driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();	
		driver.get("https://www.hyrtutorials.com/p/basic-controls.html");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("document.getElementById('firstName').value='surendra'");
		js.executeScript("document.getElementById('femalerb').click()");
		List list = (List) js.executeScript("return document.getElementsByName('language')");
		for(Object o : list)
		{
			js.executeScript("arguments[0].click()", o);
		}
		js.executeScript("document.evaluate(\"//button[text()='Register']\",document,null,XPathResult.FIRST_ORDERED_NODE_TYPE,null).singleNodeValue.click()");
//		js.executeScript("document.getElementById('registerbtn').click()");
		WebElement we = driver.findElement(By.id("navigateHome"));
		String text = (String) js.executeScript("return arguments[0].text;", we);
		System.out.println(text);
		Thread.sleep(3000);
		driver.quit();
	}

}
