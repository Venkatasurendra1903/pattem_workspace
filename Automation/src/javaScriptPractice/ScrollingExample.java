package javaScriptPractice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollingExample {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Venkata.Pattem.ACS\\OneDrive - ACS Solutions\\Desktop\\driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();	
		driver.get("https://www.google.co.in/");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("alert('hello')");
		Alert alert = driver.switchTo().alert();
		alert .accept();
		Thread.sleep(3000);
		driver.navigate().to("https://www.facebook.com/");
		js.executeScript("document.getElementById('email').value='8639386590'");
		String text = (String)js.executeScript("return document.getElementById('email').value");
		System.out.println("the entered text in the textbox is:\n"+text);
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		Thread.sleep(3000);
		driver.quit();

	}

}
