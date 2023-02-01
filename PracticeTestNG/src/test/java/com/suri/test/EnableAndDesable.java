package com.suri.test;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EnableAndDesable
{
	
	WebDriver driver;
//	@Ignore
	@Test  (enabled=false)
	public void TestGoogle()
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("HYR Tutorials", Keys.ENTER);
		String expectedTitle = "HYR Tutorials - Google Search";
		String actualTitle = driver.getTitle();
		assertEquals(actualTitle, expectedTitle, "Title is mismatched");
		driver.quit();
	}
	@Test  //(enabled=false)
	public void facebook()
	{
//		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		String s = driver.getTitle();
		System.out.println("the title is :"+s);
		driver.quit();
	}
}
