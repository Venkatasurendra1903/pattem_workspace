package com.crm.qa.testcases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;

public class LoginPageTest extends TestBase{
	LoginPage loginPage;
	HomePage homePage;
	
	public LoginPageTest() {
		super();
	}
	@BeforeMethod
	public void setUp(){
		initialization();
		loginPage = new LoginPage();	
	}
	SoftAssert s = new SoftAssert();
	@Test(priority=1)
	public void loginPageTitleTest(){
		String title = loginPage.validateLoginPageTitle();
		System.out.println(title);
//		System.out.println(s.assertEquals(title, "CRMPRO - CRM software for customer relationship management, sales, and support"));
//		return title;
		
	}
//	@Test(priority=2)
//	public void crmLogoImageTest(){
//		boolean flag = loginPage.validateCRMImage();
//		Assert.assertTrue(flag);
//	}
	@Test(priority=3)
	public void loginTest(){
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
//		driver.findElement(By.name("//a[contains(text(),'Messages')]")).click();
//		driver.findElement(By.xpath("//td[contains(@class,'datacardtitle')]//input[@value='New Message']")).click();
//		driver.findElement(By.xpath("//input[@id='subject']")).sendKeys("surendra");
	}
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}
}
