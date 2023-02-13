package MMT;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;
public class MMt_otp {

	public static void main(String[] args) throws Exception {

		WebDriverManager.edgedriver().setup();
//		System.setProperty("webdriver.msedge.driver", "C:\\Users\\Venkata.Pattem\\eclipse-workspace\\msedgedriver.exe");
		EdgeOptions options = new EdgeOptions();
		options.addArguments("--disable-blink-features=AutomationControlled");
		options.setExperimentalOption("excludeSwitches", new String[]{"enable-automation"});
		WebDriver driver = new EdgeDriver(options);
		driver.manage().deleteAllCookies();
		driver.get("https://temp-mail.io/en");
		Thread.sleep(3000);
		driver.manage().window().maximize();
		WebElement copy = driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/header/div[3]/button[1]/span"));
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		copy.click();
		Thread.sleep(3000);
		driver.switchTo().newWindow(WindowType.TAB);	//open a new blank tab
		driver.get("https://www.makemytrip.com/");
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		System.out.println("after switching title is:"+driver.getTitle());
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div[2]/div/span")).click();
		driver.findElement(By.xpath("//*[@id=\"SW\"]/div[1]/div[1]/ul/li[4]")).click();
		Thread.sleep(3000);
		driver.findElement(By.name("username")).sendKeys(Keys.CONTROL,"V");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"SW\"]/div[1]/div[2]/div[2]/section/form/div[2]/button")).click();
		Thread.sleep(3000);

		String parent = driver.getWindowHandle();
		System.out.println("the parent window is:"+parent);
		Set<String> child = driver.getWindowHandles();
		System.out.println(child);
		for(String handle : child) {
			if(!handle.equals(parent)) {
				driver.switchTo().window(handle);
			}
		}
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/aside/div[1]/div[2]/div/div/ul/li/div[4]/span")).click();
		String OTPfull = driver.findElement(By.xpath("//p[text()='Dear ']/following-sibling::p/b")).getText();
		System.out.println(OTPfull);
		String OTP = OTPfull.replace("OTP is ", "");
		System.out.println(OTP);
		for(String handle : child) {
			if(handle.equals(parent)) {
				driver.switchTo().window(handle);
			}
		}
		driver.findElement(By.xpath("//input[@placeholder=\"Enter OTP here\"]")).sendKeys(OTP);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@data-cy='verifyAndCreate']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//p[text()='Skip']")).click();
		

	}

}
