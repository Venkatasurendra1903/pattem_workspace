package com.suri.test;

import static org.testng.Assert.*;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.Assert.*;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AssertExample 
{
	WebDriver driver;
	
	 @Test 
	  public void equalsOrNot() 
	  { 
		  WebDriverManager.chromedriver().setup();
		  driver = new ChromeDriver(); 
		  driver.get("https://www.google.co.in/");
		  driver.findElement(By.name("q")).sendKeys("flipkart", Keys.ENTER); 
		  String expectedTitle = "flipkart - Google Search"; 
		  String actualTitle = driver.getTitle(); 
		  assertEquals(actualTitle, expectedTitle); 
		  
		  driver.quit(); 
	  }
	 

	@Test
	public void facebook() throws Exception 
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.name("email")).sendKeys("suri@gmail.com", Keys.ENTER);
		Thread.sleep(5000);

//		SoftAssert s = new SoftAssert();
		// title assertion
		String expectedTitle = "Log in to Facebook";
		String actualTitle = driver.getTitle();
		assertEquals(actualTitle, expectedTitle);

		//  URL assertion
		SoftAssert s = new SoftAssert();
		String expectedUrl = "https://www.facebook.com/login/?privacy_mutation_token=eyJ0eXBlIjowLCJjcmVhdGlvbl90aW1lIjoxNjY5MTc4ODc1LCJjYWxsc2l0ZV9pZCI6MzgxMjI5MDc5NTc1OTQ2fQ%3D%3D";
		String actualUrl = driver.getCurrentUrl();
		s.assertEquals(actualUrl, expectedUrl);

		// text assertion
		String expectedText = "suri@gmail.com";
		String actualText = driver.findElement(By.name("email")).getAttribute("Value");
		assertEquals(actualText, expectedText);

		// Border assertion
		String expectedBorder = "1px solid rgb(221, 223, 226)";
		String actualBorder = driver.findElement(By.name("email")).getCssValue("border");
		assertEquals(actualBorder, expectedBorder);

		// errorMessage assertion
		String expectederrorMessage = "The password that you've entered is incorrect. Forgotten password?";
		String actualerrorMessage = driver.findElement(By.xpath("//*[@id=\"loginform\"]/div[2]/div[2]")).getText();
		assertEquals(actualerrorMessage, expectederrorMessage);

		driver.quit();
//		s.assertAll();
	}
}
