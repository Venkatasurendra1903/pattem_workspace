package MMT;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MMt_otp {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://temp-mail.org/en/");
		driver.manage().timeouts().pageLoadTimeout(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		Thread.sleep(1000);
//		String copy = driver.findElement(By.xpath("//*[@id=\"click-to-copy\"]")).getText();
//		driver.findElement (By.xpath("//*[@id=\"click-to-copy\"]")).sendKeys(Keys.chord(Keys.CONTROL, "c"));
//		System.out.println("the copied mail from temp-mail is:"+copy);
		WebElement copy = driver.findElement(By.xpath("//*[@id=\"click-to-copy\"]"));
		copy.click();
		Thread.sleep(1000);
		driver.navigate().to("https://www.makemytrip.com/");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"SW\"]/div[1]/div[1]/ul/li[4]")).click();
		Thread.sleep(1000);
		driver.findElement(By.name("username")).sendKeys(Keys.CONTROL,"V");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"SW\"]/div[1]/div[2]/div[2]/section/form/div[2]/button")).click();
		Thread.sleep(1000);
		driver.navigate().back();
		Thread.sleep(3000);
		driver.quit();

	}

}
