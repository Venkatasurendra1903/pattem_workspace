package selenium.webdriver;



import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import name.finsterwalder.fileutils.FileUtils;


public class ScreenShot {
	static WebDriver driver;
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Venkata.Pattem.ACS\\OneDrive - ACS Solutions\\Desktop\\driver\\chromedriver_win32\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("https://classic.crmpro.com/");
	driver.findElement(By.name("username")).sendKeys("suri123");
	driver.findElement(By.name("password")).sendKeys("Suri@123");
	driver.findElement(By.xpath("//input[@class='btn btn-small']")).click();
	takeScreenshot("crmpro");
	
	driver.quit();
	}
	public static void takeScreenshot(String fileName) {
		//1. take screenshot and store it as a file format:
		File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//2. now copy the screenshot to desired location using copyFile method:
//		FileUtils.copyfile(file, new File("C:\\Users\\Venkata.Pattem\\eclipse-workspace\\Automation\\src\\selenium\\webdriver\\ScreenShot/"+fileName+".jpg"));
		
	}
	
	
	

}
