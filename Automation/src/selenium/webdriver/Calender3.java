package selenium.webdriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calender3 
{
	

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws Exception 
	{
		
/*
 // 1--> Select the date from current month and year
  *
  *
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Venkata.Pattem.ACS\\OneDrive - ACS Solutions\\Desktop\\driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/calendar-practice.html");
		String date = "November 2022";
		String day = "6";
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id=\"first_date_picker\"]")).click();
		String s = driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/div")).getText();
		
		while(true)
		{
			if(s.equals(date))
			{
				break;
			}
			else
			{
				driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/a[2]/span")).click();
			}
			
		}
		driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr/td/a[contains(text(),"+day+")]")).click();
		
 */

/*

// 2--> Select the date from current month and year while the past and future dates are present
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Venkata.Pattem.ACS\\OneDrive - ACS Solutions\\Desktop\\driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/calendar-practice.html");
		String date = "November 2022";
		String day = "3";
		driver.findElement(By.xpath("//*[@id=\"second_date_picker\"]")).click();
		String s = driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/div")).getText();
		
		while(true)

		{
			if(s.equals(date))
			{
				break;
			}
			else
			{
				driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/a[2]/span")).click();
			}
		}
		driver.findElement(By.xpath("//table[@class='ui-datepicker-calendar']//td[not(contains(@class,'ui-datepicker-other-month'))]//a[text()="+day+"]")).click();
		
*/
		
// 3-->  Select the date from current month and year while the past and future dates are present
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Venkata.Pattem.ACS\\OneDrive - ACS Solutions\\Desktop\\driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");
		String date = "May 2002";
		String day = "27";
		driver.findElement(By.xpath("//*[@id=\"datepicker\"]")).click();
		while(true)
		{
			String s = driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/div")).getText();
			if(s.equals(date))
			{
				break;
			}
			else
			{
				driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/a[1]/span")).click();
			}
		}
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr/td/a[text()="+day+"]")).click();
		Thread.sleep(3000);
		driver.quit();
//		
		
	}
	


}
