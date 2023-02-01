package selenium.webdriver;

import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.Select;
//import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.support.ui.Select;

//import webdriver.commands.NavigateCommands;

public class CrmPro 
{
	@SuppressWarnings("unused")
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Venkata.Pattem.ACS\\OneDrive - ACS Solutions\\Desktop\\driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 
		driver.get("https://classic.crmpro.com/index.html");
		
/*		driver.findElement(By.name("username")).sendKeys("suri123");
		driver.findElement(By.name("password")).sendKeys("Suri@123");
		driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div/div/input")).click();
		driver.switchTo().frame("mainpanel");       
		driver.findElement(By.xpath("//a[@href=\'https://classic.freecrm.com/system/index.cfm?action=contact\']")).click();
		System.out.println("done");
		driver.quit();
 */
// Switching parent window to their child window
		
		driver.findElement(By.linkText("Pricing")).click();
		String p=driver.getWindowHandle();            //to get that perticular window path
		System.out.println(p);
		Set<String>handles=driver.getWindowHandles();   //to get all windows path		
		java.util.Iterator<String> it= handles.iterator();   //to get paths and move one window to next window
		String parent= it.next();
		String pricing=it.next();
		for(String h:handles) {
			System.out.println(h);
			if((h.equals(pricing))) {
				System.out.println();
				System.out.println(h);
				driver.switchTo().window(pricing);
				Thread.sleep(6000);
				driver.findElement(By.xpath("//*[@id=\"navbar-collapse\"]/ul/li[5]/a")).click();
				System.out.println(driver.findElement(By.xpath("//*[@id=\"contact\"]/div/div[1]/div/h1")).getText());
			}
		}

		
		
		
//		driver.findElement(By.xpath("//a[@href=\'https://classic.freecrm.com/register/\']")).click();
//		Select select =new Select (driver.findElement(By.xpath("//*[@id=\"payment_plan_id\"]")));
//		select.selectByVisibleText(" Free Edition");
//		driver.findElement(By.name("payment_plan_id")).click();
//		driver.findElement(By.xpath("//option[text()='Edition']")).click();
//		driver.findElement(By.name("first_name")).sendKeys("suri");
//		Thread.sleep(2000);
//		driver.findElement(By.name("surname")).sendKeys("p");
//		Thread.sleep(2000);
//		driver.findElement(By.name("email")).sendKeys("pattemsurendra123@gmail.com");
//		Thread.sleep(2000);
//		driver.findElement(By.name("email_confirm")).sendKeys("pattemsurendra123@gmail.com");
//		Thread.sleep(2000);
//		driver.findElement(By.name("username")).sendKeys("suri123");
//		Thread.sleep(2000);
//		driver.findElement(By.name("password")).sendKeys("Suri@123");
//		Thread.sleep(2000);
//		driver.findElement(By.name("passwordconfirm")).sendKeys("Suri@123");
//		Thread.sleep(2000);
//		driver.findElement(By.name("agreeTerms")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.name("submitButton")).click();
//		Actions action = new Actions(driver);
//		action.moveToElement(driver.findElement(By.name("payment_plan_id"))).build().perform();
//		Thread.sleep(20000);		
//		driver.findElement(By.name("company_name")).sendKeys("sss");
//		driver.findElement(By.name("phone")).sendKeys("2345779923");
//		driver.findElement(By.name("fax")).sendKeys("bjhef");
//		driver.findElement(By.name("website")).sendKeys("www.hbfvjsgwk.com");
//		driver.findElement(By.name("company_email")).sendKeys("pattemsurendra123@gmail.com");
//		driver.findElement(By.name("service")).sendKeys("no");
//		driver.findElement(By.name("address")).sendKeys("yadavalli");
//		driver.findElement(By.name("city")).sendKeys("nellore");
//		driver.findElement(By.name("state")).sendKeys("ap");
//		driver.findElement(By.name("postcode")).sendKeys("524254");
//		
//		Select select1 = new Select(driver.findElement(By.name("country")));
//		select1.selectByVisibleText("India");
//		driver.findElement(By.name("copy_address")).click();
//		driver.findElement(By.name("btnSubmit")).click();
//		
//		driver.findElement(By.name("first_name")).sendKeys("suri");	
//		driver.findElement(By.name("surname")).sendKeys("p");
//		driver.findElement(By.name("email")).sendKeys("pattemsurendra123@gmail.com");
//		Thread.sleep(2000);
//		driver.findElement(By.name("email_confirm")).sendKeys("pattemsurendra123@gmail.com");
//		Thread.sleep(2000);
//		driver.findElement(By.name("username")).sendKeys("suri123");
//		Thread.sleep(2000);
//		driver.findElement(By.name("password")).sendKeys("Suri@123");
//		Thread.sleep(2000);
//		driver.findElement(By.name("passwordconfirm")).sendKeys("Suri@123");
//		driver.findElement(By.name("User")).click();
//		driver.findElement(By.name("finish")).click();

//		driver.quit();
	}

}

