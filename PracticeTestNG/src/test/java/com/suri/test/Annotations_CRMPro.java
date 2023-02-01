package com.suri.test;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
public class Annotations_CRMPro {
	WebDriver driver;
	Actions action;
	@Test(priority = 0)
	public void Loginsession() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.crmpro.com/login.cfm");
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("suri123");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Suri@123");
		driver.findElement(By.xpath("//input[@class='btn btn-small']")).click();
	}
//
	@Test(priority = 2)
	public void contactbar() throws Exception {
		System.out.println("hi");
		driver.switchTo().defaultContent();

		driver.switchTo().frame("mainpanel");
		action = new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//*[@id=\"navmenu\"]/ul/li[4]/a"))).build().perform();
		driver.findElement(By.linkText("New Contact")).click();
		driver.findElement(By.name("first_name")).sendKeys("surendra");
		Thread.sleep(3000);	

	}

	@SuppressWarnings({ "deprecation", "unused" })
	@Test(priority = 1)
	public void calendarBar() throws InterruptedException {
		driver.switchTo().defaultContent();
		driver.switchTo().frame("mainpanel");
		action=new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//a[@title='Calendar']"))).build().perform();
		driver.findElement(By.xpath("//*[@id=\"navmenu\"]/ul/li[2]/ul/li[1]/a")).click();
		driver.findElement(By.name("title")).sendKeys("CRMpro");
		driver.findElement(By.xpath("//*[@id=\"f_trigger_c_start\"]")).click();
		Set<String> s=driver.getWindowHandles();
		System.out.println(s);
		String date = "May, 2023";
		String day = "27";
//			System.out.println(s1);
		while(true)
		{
			String s1 = driver.findElement(By.xpath("/html/body/div[6]/table/thead/tr[1]/td[2]")).getText();
			System.out.println(s1);
			if(s1.equals(date))
			{
				break;
			}
			else
			{
				driver.findElement(By.xpath("/html/body/div[6]/table/thead/tr[2]/td[4]")).click();
			}
			
		}
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.xpath("/html/body/div[6]/table/tbody/tr[4]/td[8]")).click();
		Thread.sleep(3000);
//		driver.quit();
	}
}
