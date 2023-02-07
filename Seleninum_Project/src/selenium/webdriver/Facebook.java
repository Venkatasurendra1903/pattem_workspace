package selenium.webdriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook 
{
	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Venkata.Pattem\\eclipse-workspace\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		String s = driver.findElement(By.xpath("//h2[text()='Facebook helps you connect and share with the people in your life.']")).getText();
		System.out.println("the text was present in the facebook is:\n"+s);
		driver.findElement(By.id("email")).sendKeys("p123@gmail.com");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Suri@123");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[text()='Log in']")).click();
		Thread.sleep(3000);
		driver.quit();  
		
//Sign-up
		
//		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
//		driver.findElement(By.name("firstname")).sendKeys("suri");
//		driver.findElement(By.name("lastname")).sendKeys("Pattem");
//		driver.findElement(By.name("reg_email__")).sendKeys("p123@gmail.com");
//		driver.findElement(By.name("reg_email_confirmation__")).sendKeys("p123@gmail.com");
//		driver.findElement(By.name("reg_passwd__")).sendKeys("Suri@123");
//		Select select = new Select(driver.findElement(By.xpath("//*[@id=\"day\"]")));
//		Thread.sleep(3000);
//		select.selectByVisibleText("1");
//		Select select1 = new Select(driver.findElement(By.xpath("//*[@id=\"month\"]")));
//		select1.selectByIndex(1);
////		select1.selectByVisibleText("Jun");
//		Select select2= new Select(driver.findElement(By.xpath("//*[@id=\"year\"]")));
//		select2.selectByVisibleText("2003");
//		driver.findElement(By.xpath("//label[text()='Male']")).click();
//		driver.findElement(By.xpath("//button[@name=\"websubmit\"]")).click();
////		driver.findElement(By.xpath("//input[@name='n']")).sendKeys("679953");
////		driver.findElement(By.xpath("//button[text()='Continue']")).click();
//		Thread.sleep(3000);
		
		
//		driver.quit();  
		
		
		
	}

}
