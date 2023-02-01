package selenium.webdriver;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MakeMyTrip 
{
	@SuppressWarnings("deprecation")
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Venkata.Pattem.ACS\\OneDrive - ACS Solutions\\Desktop\\driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		String a = driver.getWindowHandle();
		Set<String> b = driver.getWindowHandles();
		System.out.println(b);
		System.out.println(a);
		driver.findElement(By.xpath("//i[@class='wewidgeticon we_close']")).click();
		driver.findElement(By.xpath("//li[text()='Round Trip']")).click();
		String date1 = "December 2022";
		String day = "27";
		driver.findElement(By.xpath("//div[@class='fsw_inputBox dates inactiveWidget ']")).click();
		while(true)
		{
			String s = driver.findElement(By.xpath("//div[text()='December 2022']")).getText();

			if(s.equals(date1))
			{
				break;
			}
			else
			{
				driver.findElement(By.xpath("//span[@class='DayPicker-NavButton DayPicker-NavButton--next']")).click();
			}
			
		}
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div[1]/div[3]/div[1]/div/div/div/div[2]/div/div[2]/div[1]/div[3]/div[4]/div[4]")).click();
		
	}

}
