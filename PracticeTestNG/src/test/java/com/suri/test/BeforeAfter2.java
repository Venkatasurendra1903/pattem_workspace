package com.suri.test;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class BeforeAfter2 
{
	WebDriver driver;
	
	
  @Test
  public void ending() 
  {
	  System.out.println("all set");
  }
  @BeforeMethod
  public void beforeMethod() 
  {
	  driver.findElement(By.xpath("//span[text()='Senior Citizen']")).click();
  }

  @AfterMethod
  public void afterMethod() 
  {
	  System.out.println("curser moved from student class to senior citizen class");
  }

  @BeforeClass
  public void beforeClass() 
  {
	  driver.findElement(By.xpath("//span[@class='bgProperties icon20 overlayCrossIcon']")).click();
	  driver.findElement(By.xpath("//span[text()='Student']")).click();
  }

  @AfterClass
  public void afterClass() 
  {
	  System.out.println("the opened student class");
  }

	@SuppressWarnings("deprecation")
	@BeforeTest
	public void beforeTest() 
	{
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[1]/ul/li[2]")).click();
		driver.findElement(By.xpath("//span[text()='From']")).click();
		driver.findElement(By.xpath("//p[text()='Mumbai, India']")).click();
		driver.findElement(By.xpath("//span[text()='To']")).click();
		driver.findElement(By.xpath("//p[text()='New Delhi, India']")).click();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[2]/p/a")).click();
	}

	@AfterTest
	public void afterTest() 
	{
		System.out.println("search button was clicked after all details are selected");
	}

	@BeforeSuite
	public void beforeSuite() 
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
	}

	@AfterSuite
	public void afterSuite() 
	{
		driver.quit();
	}

}
