package selenium.webdriver;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calender2 
{
	@SuppressWarnings({ "static-access", "unused" })
	public static void main(String[] args) throws Exception 
	{
		//method 1
		
/*				System.setProperty("webdriver.chrome.driver", "C:\\Users\\Venkata.Pattem\\eclipse-workspace\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/calendar-practice.html");
		
		int day = 30;
		driver.findElement(By.xpath("//*[@id=\"second_date_picker\"]")).click();
		driver.findElement(By.xpath("//table[@class='ui-datepicker-calendar']//td[contains(@class,'ui-datepicker-other-month')]//a[text()="+day+"]")).click();
		
*/
/*		
// method 2 --- Date in  String format
		String targetDate = "10-nov-2022";
		SimpleDateFormat targetDateFormat = new SimpleDateFormat("dd-MMM-yyyy");
//		targetDateFormat.setLenient(false);
		Date d = targetDateFormat.parse(targetDate);
		System.out.println(d);
		
*/

// method 3-- if date is provided like 32-nov-2022, the output will be in next month date
// So, in this case you need to do Exception method
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Venkata.Pattem\\\\eclipse-workspace\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/calendar-practice.html");
		Calendar calendar = Calendar.getInstance();
		String s = "2-june-2022";
		SimpleDateFormat s1 = new SimpleDateFormat("dd-MMM-yyyy");
		try {
			s1.setLenient(false);
			Date d = s1.parse(s);
//			System.out.println(d);
			calendar.setTime(d);
			int day = calendar.get(Calendar.DATE);
			int month = calendar.get(calendar.MONTH);
			int year = calendar.get(calendar.YEAR);
			
			driver.findElement(By.xpath("//*[@id=\"second_date_picker\"]")).click();
			driver.findElement(By.xpath("//table[@class='ui-datepicker-calendar']//td[not(contains(@class,'ui-datepicker-other-month'))]//a[text()="+day+"]")).click();
		} catch (ParseException e) {
			throw new Exception(" the provided date is invalid, please check the input date");
		}
		
	}

}
